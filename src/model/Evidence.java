/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

public class Evidence implements Serializable{
    private String jenis;
    private String deskripsi;

    public Evidence(String jenis, String deskripsi) {
        this.jenis = jenis;
        this.deskripsi = deskripsi;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}