/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaktermetodusok;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Karaktermetodusok {
    
    public static void vonal() {
        System.out.println("*************************");
        System.out.println("*        Feladat        *");
        System.out.println("*************************");
    }
    public static boolean ellenoriz(String szam1) {
        if ( (szam1.length() == 6) && (szam1.length() == 7)){
            if (szam1.charAt(0,1) == \u0030){
                
            }
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        char kar = 'a';
        
        //alfabetikus-e
        System.out.println(Character.isAlphabetic(kar));
        //szám-e
        System.out.println(Character.isDigit(kar));
        //betű-e
        System.out.println(Character.isLetter(kar));
        //betű vagy szám-e
        System.out.println(Character.isLetterOrDigit(kar));
        //kisbetű-e
        System.out.println(Character.isLowerCase(kar));
        //nagybetű-e
        System.out.println(Character.isUpperCase(kar));
        //szóköz-e
        System.out.println(Character.isSpaceChar(kar));
        //whitespace karakter-e 
        System.out.println(Character.isWhitespace(kar));
        //nagybetűként irja ki
        System.out.println(Character.toUpperCase(kar));
        //kisbetűként írja ki
        System.out.println(Character.toLowerCase(kar));
        
        vonal();
        
        Scanner bill = new Scanner(System.in);
        System.out.print("Add meg a személyi számodat: ");
        String szam1 = bill.nextLine();
        System.out.println(ellenoriz(szam1));
        
        
        
        
    }
    
}
