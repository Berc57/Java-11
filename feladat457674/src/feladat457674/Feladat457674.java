/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat457674;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Feladat457674 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Add meg a neved: ");
        String fullName = bill.nextLine();
        System.out.println("A megadott név: " + fullName);
        String firstName = fullName.split(" ")[0];
        System.out.println("A vezetékneved:" + firstName);
        String lastName = fullName.split(" ")[1];
        System.out.println("A kereszteved:" + lastName);
        
        System.out.println("Add meg az osztályod: (pl.: 2022ee)");
        String classId = bill.nextLine();
        
        
        classId = classId.replaceFirst("e", "E");
        System.out.println(classId);
        
        int evfolyam = Integer.parseInt(classId.substring(0,4));
        if (evfolyam < 2022) classId = classId.toUpperCase();
        
        if (classId.equals(classId.toUpperCase()))
            System.out.println("Estis osztály");
        
        
        
    }
    
}
