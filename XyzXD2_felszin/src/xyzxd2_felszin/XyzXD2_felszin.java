/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzxd2_felszin;
import java.lang.Math.*;

/**
 *
 * @author diak
 */
public class XyzXD2_felszin {

    public static double felszin(int sugar, int magassag)
    {
        double felszin = (2 * (sugar * sugar) * Math.PI) + (2 * sugar * Math.PI * magassag);  
        return felszin;
    } 
    public static void main(String[] args){
        double felszin = felszin(sugar, magassag);
        System.out.println("A henger felszíne: " + felszin);
    }
    
}
