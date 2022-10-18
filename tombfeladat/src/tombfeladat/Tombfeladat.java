/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombfeladat;

/**
 *
 * @author diak
 */
public class Tombfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list1 = new int[10];
        
        int randomSzam = (int) (Math.random() * 10) + 1;
        
        
        for (int i = 0; i < 10; i++){
            randomSzam = (int) (Math.random() * 10) + 1;
            list1[i] = (randomSzam);
        }
        int o = 0;
        int c1 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(list1[i] + ", ");
            o += list1[i];
            if (list1[i] % 2 == 0){
                c1 += 1;
            }
        }
        int min = 0;
        int max = 0;
        for(int i = 1; i < list1.length; i++){
            if( list1[i] < list1[min]) min = i;
        }
        for(int i = 1; i < list1.length; i++){
            if( list1[i] < list1[max]) max = i;
        }
        int i = 0;
        
        
        System.out.println("");
        System.out.println("Az összeg: " + o);
        System.out.println("A páros számok darabja: " + c1);
        System.out.println("A legkisebb: " + list1[min]);
        System.out.println("A legnagyobb: " + list1[max]);
        while (list1[i] > 5) {
            i++;
        }
        System.out.println("Első 5-nél kisebb szám:"+i);
        i = 0;
        while (i < list1.length && (list1[i] % 4 != 0)) {
            i++;
        }
        if (i < list1.length) {
            System.out.println("Van néggyel osztható szám");
        }
        
        
        
    }
    
}
