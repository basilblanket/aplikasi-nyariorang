/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class CaseRecord {
    private Person person;
    private ArrayList<Evidence> evidenceList;
    private ArrayList<String> catatanList;

    public CaseRecord(Person person) {
        this.person = person;
        this.evidenceList = new ArrayList<>();
        this.catatanList = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public void addEvidence(Evidence evidence) {
        evidenceList.add(evidence);
    }

    public void addCatatan(String catatan) {
        catatanList.add(catatan);
    }

    public ArrayList<Evidence> getEvidenceList() {
        return evidenceList;
    }

    public ArrayList<String> getCatatanList() {
        return catatanList;
    }
}