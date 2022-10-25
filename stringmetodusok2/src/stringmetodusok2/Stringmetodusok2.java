/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok2;

/**
 *
 * @author diak
 */
public class Stringmetodusok2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "A Diák osztály objektuma (Vad Alma ) példányosítás útján jön létre";
        int index = szoveg.indexOf("(");
        int lastindex = szoveg.lastIndexOf(")"); 
        String nev = szoveg.substring(index + 1, lastindex).trim().replace("Alma", "Körte");
        System.out.println(nev.toUpperCase());
        System.out.println(nev.length());
        
        String iskolacim = nev.replace(" ", ".").toLowerCase().concat(".2022i@bankitatabanya.hu");
        System.out.println(iskolacim);
        
        String szoveg2 = "Sok lúd disznót győz";
        String szoveg3 = "Sok lúd disznót győz";
        
        szoveg2.length();
        szoveg2.charAt(0);
        szoveg2.compareTo(szoveg3);
        szoveg2.contains("lúd");
        szoveg2.indexOf("lúd");
        szoveg2.replace("lúd", "veréb");
        szoveg.substring(szoveg.indexOf(" "));
        
    }
    
}
