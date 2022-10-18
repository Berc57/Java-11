/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

/**
 *
 * @author diak
 */
public class Stringmetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg. ";
        
        //szöveg hossza
        System.out.println(szoveg.length());
        
        //adott pozicion lévő karakter
        System.out.println(szoveg.charAt(5));
        
        //minden kisbetű
        System.out.println(szoveg.toLowerCase());
        
        //minden nagybetű
        System.out.println(szoveg.toUpperCase());
        
        //sor elejéről és sor végéről space levágás
        System.out.println(szoveg.trim().length());
        
        //összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.compareToIgnoreCase("Ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.equals("Ez egy...."));
        System.out.println(szoveg.equalsIgnoreCase("Ez egy tetszőleges szöveg. "));
        
        //összefűzés
        System.out.println(szoveg.concat("Ez pedig egy hozzáfűzés."));
        
        //tartalmazza-e
        System.out.println(szoveg.contains("tetszőleges"));
        
        //végződik e valamivel
        System.out.println(szoveg.endsWith(" "));
    }
    
    
}
