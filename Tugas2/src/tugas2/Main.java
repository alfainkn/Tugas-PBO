/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import tugas2.Ruang.Balok;
import tugas2.Ruang.Kerucut;
import java.util.Scanner;
/**
 *
 * @author userr
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        do{
            Scanner menu = new Scanner(System.in);
            System.out.println("---- Menu ----");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. Exit");
            System.out.print("PILIH = ");
            int pilih=menu.nextInt();
            switch(pilih){
                case 1:
                    balok(input);
                    break;
                case 2:
                    kerucut(input);
                    break;
                case 3:
                    exit=true;
                    break;
            }
            System.out.print("\n");
        } while(!exit);
    }
    
    public static void balok(Scanner input){
        int panjang,lebar,tinggi;
        
        System.out.print("--INPUT--\n");
        System.out.print("Panjang\t: ");
        panjang = input.nextInt();
        System.out.print("Lebar\t: ");
        lebar = input.nextInt();
        System.out.print("Tinggi\t: ");
        tinggi = input.nextInt();
        
        Balok balok = new Balok(panjang,lebar,tinggi);
        
        System.out.println("--OUTPUT--");
        System.out.println("Luas Persegi\t\t= " + balok.Luas());
        System.out.println("Keliling Persegi\t= " + balok.Keliling());
        System.out.println("Volume Balok\t\t= " + balok.Volume());
        System.out.println("Luas Permukaan Balok\t= " + balok.LuasPermukaan());
    }
    
    public static void kerucut(Scanner input){
        int panjang,lebar,tinggi,jari2;
        
        System.out.print("--INPUT--\n");
        System.out.print("Jari2\t: ");
        jari2 = input.nextInt();
        System.out.print("Tinggi\t: ");
        tinggi = input.nextInt();
        
        Kerucut kerucut = new Kerucut(jari2,tinggi);
        
        System.out.println("--OUTPUT--");
        System.out.println("Luas Lingkaran\t\t= " + kerucut.Luas());
        System.out.println("Keliling Lingkaran\t= " + kerucut.Keliling());
        System.out.println("Volume Kerucut\t\t= " + kerucut.Volume());
        System.out.println("Luas Permukkaan Kerucut\t= " + kerucut.LuasPermukaan());
    }
    
    
}
