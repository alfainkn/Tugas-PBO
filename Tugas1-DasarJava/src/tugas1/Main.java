/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        String nama, nim;
        int usia, nilaiUTS, nilaiUAS;
        int pilih;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("\n===Input===");
        System.out.print("Nama: ");   
        nama = inputUser.next();
        System.out.print("Nim: ");
        nim = inputUser.next();
        System.out.print("Usia: ");
        usia = inputUser.nextInt();
        System.out.print("Nilai UTS: ");
        nilaiUTS = inputUser.nextInt();
        System.out.print("Nilai UAS: ");
        nilaiUAS = inputUser.nextInt();
        
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, usia, nilaiUTS, nilaiUAS);
        
        do{
            System.out.println("\n===Opsi===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Exit");
            System.out.print("pilih: ");
            pilih = inputUser.nextInt();    

            switch (pilih) {
                case 1:
                    System.out.println("\nPerkenalkan Nama Saya " + mahasiswa1.nama + ", NIM " + mahasiswa1.nim);
                    System.out.println("Usia \t: " + mahasiswa1.usia);
                    System.out.println("Nilai Akhir : " + mahasiswa1.hitungRataRata());
                    break;
                case 2:
                    System.out.println("\n===Input===");
                    System.out.print("Nama: ");
                    nama = inputUser.next();
                    System.out.print("Nim: ");
                    nim = inputUser.next();
                    System.out.print("Usia: ");
                    usia = inputUser.nextInt();
                    System.out.print("Nilai UTS: ");
                    nilaiUTS = inputUser.nextInt();
                    System.out.print("Nilai UAS: ");
                    nilaiUAS = inputUser.nextInt();
                    mahasiswa1 = new Mahasiswa(nama, nim, usia, nilaiUTS, nilaiUAS);
                    break;
                default:
                    System.exit(0);
            }
        }while(pilih!=3);
                
    }
    
    
}
