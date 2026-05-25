/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.*;

public class DataManager {
    public static ArrayList<CaseRecord> missingList = new ArrayList<>();
    public static ArrayList<CaseRecord> suspectList = new ArrayList<>();

    public static void addMissing(MissingPerson p) {
        missingList.add(new CaseRecord(p));
    }

    public static void addSuspect(Suspect s) {
        suspectList.add(new CaseRecord(s));
    }

    public static ArrayList<CaseRecord> getList(String tipe) {
        if (tipe.equals("missing")) {
            return missingList;
        } else {
            return suspectList;
        }
    }

    public static ArrayList<CaseRecord> search(String tipe, String keyword) {
        ArrayList<CaseRecord> hasil = new ArrayList<>();

        for (CaseRecord c : getList(tipe)) {
            if (c.getPerson().getNama().toLowerCase().contains(keyword.toLowerCase())) {
                hasil.add(c);
            }
        }

        return hasil;
    }
}