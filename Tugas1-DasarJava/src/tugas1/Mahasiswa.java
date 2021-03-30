/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    String nama, nim;
    int usia, nilaiUTS, nilaiUAS;

    public Mahasiswa(String nama, String nim, int usia, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    int hitungRataRata(){
        return (nilaiUAS+nilaiUTS)/2;
    }
}
