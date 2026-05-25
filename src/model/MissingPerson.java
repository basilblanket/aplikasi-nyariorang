/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class MissingPerson extends Person {
    private String status;

    public MissingPerson(String id, String nama, int umur, String lokasiTerakhir, String ciriCiri, String status,
            String fotoPath) {
        super(id, nama, umur, lokasiTerakhir, ciriCiri, status, fotoPath);
    }

    @Override
    public String getJenis() {
        return "Missing Person";
    }
}
