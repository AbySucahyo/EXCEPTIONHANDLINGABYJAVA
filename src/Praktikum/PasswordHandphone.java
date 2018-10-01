/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Aby
 */
public class PasswordHandphone {
    public static void main(String[] args) throws ArithmeticException,NullPointerException,IOException {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan PASSWORD(angka): ");
        int password = input.nextInt();
    
        try{
            if(password == 12345 ){
                throw new ArithmeticException("Password Benar");
            }else{
                throw new NullPointerException("Password Salah, COBA LAGI");
            }
        }catch(Exception e){
            System.out.println("\n------Exception ditangkap disini------\n");
            System.out.println(e.getMessage());
        }
    }
}

