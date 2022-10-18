/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author diak
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //matematikai műveletek
            //két operandosú
            int a = 43;
            int b = 35;
            
            int osszeg = a + b;
            System.out.println(osszeg);
            int kulonbseg = a - b;
            System.out.println(kulonbseg);
            int szorzat = a * b;
            System.out.println(szorzat);
            int hanyados = a / b;
            System.out.println(hanyados);
            
            int maradek = a % b; //az a/b osztás maradékát adja
            System.out.println(maradek);
            
            //egy operandosú műveletek(egy szám)
            int c = 5;
            c++; //c értékének növelése 1-el postfix formában
            System.out.println(c);
            System.out.println(c++);
            System.out.println(++c);
            
            int d = 3;
            d--;
            System.out.println(d);
            System.out.println(--d);
            
            //relációs műveletek
            int x = 9;
            int y = 14;
            
            System.out.println(x > y); //false
            System.out.println(y > x); //true
            System.out.println(x >= y); //false
            System.out.println(y >= x); //true
            System.out.println(x == y); //false
            System.out.println(x != y); //true
            
            System.out.println("-----------------");
            //logikai műveletek
            boolean t = true;
            boolean f = false;
            
            System.out.println(t && f); //ÉS művelet
            System.out.println(t || f); //VAGY művelet
            System.out.println(!t); //NEGÁCIÓ
            
            //értékadó műveletek
            int k;
           
            k = 3;
            k = k + 1;
            k +=1; //összevontuk a műveleteket
            
            k /= 4;
            k %= 2;
            
            System.out.println("-------------------");
            //összetett műveletek
            int z = 12;
            //3-mal és 4-gyel IS osztható-e
            System.out.println((z % 3 == 0) && (z % 4 ==0)); //true
            
            //3-mal vagy 4-gyel osztható-e
            System.out.println((z % 3 == 0) || (z % 4 ==0)); //true
            
            //3-mal és 5-el nem osztható-e
            System.out.println((z % 3 != 0) && (z % 4 !=0)); //false
            
            //5-el osztható nem negatív szám-e
            System.out.println((z % 5 == 0) && (z > 0)); //false
    }
    
}
