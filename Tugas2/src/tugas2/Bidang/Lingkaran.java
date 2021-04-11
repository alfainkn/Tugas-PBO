/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Bidang;

/**
 *
 * @author userr
 */
public class Lingkaran implements MenghitungBidang{
    
    //R = jari2
    protected double R;

    public Lingkaran(double R) {
        this.R = R;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }
    
    @Override
    public double Keliling() {
        return Math.PI*2*R;
    }

    @Override
    public double Luas() {
        return Math.PI*R*R;
    }
    
    
    
}
