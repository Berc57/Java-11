/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2023_02_14;
import java.util.Scanner;
/**
 *
 * @author diak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        int num = 10;
        String decide;
        if (num < 20){
            decide = "Kisebb";
        }
        else{
            decide = "Nagyobb";
        }
        System.out.println(decide);
        
        decide = (num < 20)? "Kisebb" : "Nagyobb";
        
        System.out.println(decide);
        
        System.out.print("Add meg a karaktered: ");
        char szam = bill.next().charAt(0);
        
        if (Character.isUpperCase(szam)){
            System.out.println("A(z) '" + szam + "' nagybetűs");
        }
        else{
            System.out.println("A(z) '" + szam + "' kisbetűs");
        }
        System.out.println(Character.isUpperCase(szam)? "A(z) '" + szam + "' nagybetűs" : "A(z) '" + szam + "' kisbetűs");
        
    }
    
}
