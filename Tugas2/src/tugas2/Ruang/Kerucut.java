/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Ruang;
import tugas2.Bidang.Lingkaran;
/**
 *
 * @author userr
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    
    //R=Jari-jari
    private double tinggi;

    public Kerucut(double tinggi, double R) {
        super(R);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume() {
        return ((double)1/3)*Luas()*tinggi;
    }

    @Override
    public double LuasPermukaan() {
        double S = Math.sqrt((R*R)+(tinggi*tinggi));
        return Math.PI*R*(R+S);
    }
    
}
