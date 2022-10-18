/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author diak
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte homerseklet = 19;
        short magassag = 111;
        int fizetes = 850000;
        long nyeremeny = 250000000;
        //valós számok
        float tomeg = 44333.569874521F;
        double ezEgyvalosszam = 22556743.357632;
        //karakter
        char egyBetu = 'k';
        char masikBetu = '\u0041'; //a karakter unicode kódja hexadecimálisan
        System.out.println(masikBetu);
        
        //logikai
        boolean vane = false;
        
        //változók értékeinek kiiratása
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyvalosszam);
        System.out.println(egyBetu);
        System.out.println(masikBetu);
        System.out.println(vane);
        
        //változókényszerités
        System.out.println(masikBetu);
        System.out.println((int)masikBetu);
        
        //adattipusok tartománya
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        System.out.println("A byte adattípus tartománya " + byteAlja + " értéktől " + byteTeteje + " értékig terjed.");
        int shortAlja = Short.MIN_VALUE;
        int shortTeteje = Short.MAX_VALUE;
        System.out.println("A short adattípus tartománya " + shortAlja + " értéktől " + shortTeteje + " értékig terjed.");
        long longAlja = Long.MIN_VALUE;
        long longTeteje = Long.MAX_VALUE;
        
    }
    
}
