/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

public class Person implements Serializable{
    protected String id;
    protected String nama;
    protected int umur;
    protected String lokasiTerakhir;
    protected String ciriCiri;
    protected String status;
    protected String fotoPath;

    public Person(String id, String nama, int umur, String lokasiTerakhir, String ciriCiri, String status, String fotoPath) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.lokasiTerakhir = lokasiTerakhir;
        this.ciriCiri = ciriCiri;
        this.status = status;
        this.fotoPath = fotoPath;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getLokasiTerakhir() { return lokasiTerakhir; }
    public String getCiriCiri() { return ciriCiri; }
    public String getStatus() {
    return status;
}

    public String getJenis() {
        return "Person";
    }
    public String getFotoPath() {
        return fotoPath;
    }
    public void setStatus(String status) {
    this.status = status;
    }
}
