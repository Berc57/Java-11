/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1202feladat;


/**
 *
 * @author diak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list1 = new int[10];
        
        int randomSzam = (int) (Math.random() * 100) + 1;
        
        for (int i = 0; i < 10; i++)
        {
            randomSzam = (int) (Math.random() * 100) + 1;
            list1[i] = (randomSzam);
        }
        for (int i = 0; i < list1.length; i++)
        {
            System.out.print(list1[i] + ", ");
        }
        System.out.println("");
        
        int max = 0;
        int masodikmax = 0;
        
        for (int i = 0; i < list1.length; i++)
        {
            if (list1[i] > list1[max])
            {
                max = i;
            }
        }
        for (int i = 0; i < list1.length; i++)
        {
            if (list1[i] < list1[max] && list1[i] > list1[masodikmax])
            {
                masodikmax = i;
            }
        }
        
        System.out.println(list1[max]);
        System.out.println(list1[masodikmax]);
        
    }
    
}
