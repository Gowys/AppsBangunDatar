/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

/**
 *
 * @author dell
 */
public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga() {
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    double keliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Overload
    public float luas(float alas, float tinggi){
        return 0.5 * (this.alas * this.tinggi);
    }
    
    //Overload
    public float keliling(float alas, float tinggi){
        return this.alas + this.tinggi + getSisiMiring();
    }
    
    public float getSisiMiring(){
        return (float) Math.sqrt((this.alas*this.alas)+(this.tinggi*this.tinggi));
    }
}
