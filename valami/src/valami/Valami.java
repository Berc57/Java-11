/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valami;
import java.util.Scanner;
/**
 *
 * @author diak
 */
public class Valami {

    public static boolean parose(int szam){
        int length = String.valueOf(szam).length();
        int count = 0;
        
        for (int i = 0; i < length; i++)
        {
            String stringszam = String.valueOf(szam);
            String egyszam = stringszam.substring(i);
            int egyszamszam = Integer.valueOf(egyszam);
            if (egyszamszam % 2 == 0)
            {
                count++;
            }
        }
        if (count == length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean kozponte(int a, int b, int c){
        if (((a+b)/2) == c || ((a+c)/2) == b || ((b+c)/2) == a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void matrix(int matrix){
        for (int i = 0; i < matrix; i++)
        {
            for (int j = 0; j < matrix; j++)
            {
                int randomSzam = (int) (Math.random() * 2) + 0;
                System.out.print(randomSzam + "\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Adj meg egy szĂˇmot: ");
        int szam = bill.nextInt();
        
        System.out.println("A szĂˇmom minden szĂˇmjegye pĂˇros?: " + parose(szam));
        
        System.out.print("Adj meg egy szĂˇmot: ");
        int a = bill.nextInt();
        System.out.print("Adj mĂ©g meg egy szĂˇmot: ");
        int b = bill.nextInt();
        System.out.print("Adj meg meg mĂ©g egy szĂˇmot: ");
        int c = bill.nextInt();
        
        System.out.println("KĂ¶zĂ©ppont valamelyik?: " + kozponte(a, b, c));
        
        System.out.print("Adj meg egy szĂˇmot: ");
        int matrix = bill.nextInt();
        
        matrix(matrix);
        
        
    }
    
    
}
