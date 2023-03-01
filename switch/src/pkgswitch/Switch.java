/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bill = new Scanner(System.in);
        System.out.println("Adj meg egy hónapot: ");
        int honap = bill.nextInt();
        System.out.println("Add meg az évet: ");
        int ev = bill.nextInt();
        
        if((honap == 0) || (honap > 12)){
            System.out.println("1 és 12 között adj meg számot");
        }
        else{
            System.out.println("A te hónapod: ");
        }
        int monthNumber = honap;
        String monthName;
        int napok = 0;
        boolean eve;
        
        if (ev % 4 == 0 && ev % 100 != 0 || ev % 400 == 0){
            eve = true;
        }
        else{
            eve = false;
        }
        
        switch(monthNumber){
            case 1:
                monthName = "Január";
                napok = 31;
                break;
            case 2:
                monthName = "Február";
                if (eve == true){
                    napok = 29;
                }
                else if (eve == false){
                    napok = 28;
                }
                break;
            case 3:
                monthName = "Március";
                napok = 31;
                break;
            case 4:
                monthName = "Április";
                napok = 30;
                break;
            case 5:
                monthName = "Május";
                napok = 31;
                break;
            case 6:
                monthName = "Június";
                napok = 30;
                break;
            case 7:
                monthName = "Július";
                napok = 31;
                break;
            case 8:
                monthName = "AAgusztus";
                napok = 31;
                break;
            case 9:
                monthName = "Szeptember";
                napok = 30;
                break;
            case 10:
                monthName = "Október";
                napok = 31;
                break;
            case 11:
                monthName = "November";
                napok = 30;
                break;
            case 12:
                monthName = "December";
                napok = 31;
                break;
            default:
                monthName = "Valami nem jó";
                break;
        }
        System.out.println(monthName);
        System.out.println("A hónapban ennyi nap van: " + napok);
    }
    
}
