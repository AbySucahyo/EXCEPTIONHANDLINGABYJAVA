/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author Aby
 */
public class DemoThrow {
    public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.setNim("101533402134");
        obj.setNama("Hafidz");
        obj.setNilai(25);
        
        System.out.println("NIM : "+obj.getNim());
        System.out.println("Nama : "+obj.getNama());
        System.out.println("Nilai : "+obj.getNilai());
    }
}
