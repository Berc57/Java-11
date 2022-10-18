/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethods;

/**
 *
 * @author diak
 */
public class Stringmethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg. ";
        
        //szĂ¶veg hossza
        System.out.println(szoveg.length());
        
        //adott pozicion lĂ©vĹ‘ karakter
        System.out.println(szoveg.charAt(5));
        
        //minden kisbetĹ±
        System.out.println(szoveg.toLowerCase());
        
        //minden nagybetĹ±
        System.out.println(szoveg.toUpperCase());
        
        //sor elejĂ©rĹ‘l Ă©s sor vĂ©gĂ©rĹ‘l space levĂˇgĂˇs
        System.out.println(szoveg.trim().length());
        
        //Ă¶sszehasonlĂ­tĂˇs
        System.out.println(szoveg.compareTo("Ez egy tetszĹ‘leges szĂ¶veg. "));
        System.out.println(szoveg.compareToIgnoreCase("Ez egy tetszĹ‘leges szĂ¶veg. "));
        System.out.println(szoveg.equals("Ez egy...."));
        System.out.println(szoveg.equalsIgnoreCase("Ez egy tetszĹ‘leges szĂ¶veg. "));
        
        //Ă¶sszefĹ±zĂ©s
        System.out.println(szoveg.concat("Ez pedig egy hozzĂˇfĹ±zĂ©s."));
        
        //tartalmazza-e
        System.out.println(szoveg.contains("tetszĹ‘leges"));
        
        //vĂ©gzĹ‘dik e valamivel
        System.out.println(szoveg.endsWith(" "));
        
        //keresett karakter(ek) poziciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        
        //string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        
        //replace: lecseréli a szövegben a megadott karaktereket más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        
        //replace first:
        System.out.println(szoveg.replaceFirst("e", "a"));
        
        //split: string felvágás
        System.out.println(szoveg.split(" "));
        
        //nem string tipusu adat stringé alakitása
        Integer szam = 512;
        System.out.println(szam.toString());
        
        //stringből substring kivétele
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3, 6));
    }
    
    
}
