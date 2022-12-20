/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

/**
 *
 * @author User
 */
public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    

    @Override
    public void setNamaBangunDatar(String namaBangunDatar) {
        super.setNamaBangunDatar(namaBangunDatar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNamaBangunDatar() {
        return super.getNamaBangunDatar(); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    double luas() {
       return panjang * lebar;
               }

    @Override
    double keliling() {
        return 2*(panjang + lebar);
    }
    
}
