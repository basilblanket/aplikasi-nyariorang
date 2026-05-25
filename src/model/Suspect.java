/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Suspect extends Person {
    private String tingkatRisiko;

    public Suspect(String id, String nama, int umur, String lokasiTerakhir, String ciriCiri, String tingkatRisiko, String status, String fotoPath) {
        super(id, nama, umur, lokasiTerakhir, ciriCiri, status, fotoPath);
        this.tingkatRisiko = tingkatRisiko;
    }

    public String getTingkatRisiko() {
        return tingkatRisiko;
    }

    @Override
    public String getJenis() {
        return "Buronan";
    }
}
