/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

/**
 *
 * @author ACER
 */
public class Lingkaran extends BangunDatar{
    
    public final double PHI = 3.14;
    double r;

    public Lingkaran() {
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void setNamaBangunDatar(String namaBangunDatar) {
        super.setNamaBangunDatar(namaBangunDatar); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNamaBangunDatar() {
        return super.getNamaBangunDatar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    

    @Override
    double luas() {
        return PHI * r * r;
    }

    @Override
    double keliling() {
    
        return 2 * PHI *r;
    
}
}
