/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author Aby
 */
public class NegativeNumberException extends Exception{
    private int bilangan;
    //default consturctor

    public NegativeNumberException() {
    }
    //constructor dengan parameter bertipe String 

    public NegativeNumberException(String pesan) {
        super(pesan);
    }
    //constructor dengan parameter bertipe String dan int 

    public NegativeNumberException(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
    
    
}
