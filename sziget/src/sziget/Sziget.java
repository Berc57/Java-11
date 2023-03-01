/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sziget;

/**
 *
 * @author diak
 */
public class Sziget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] meresek = {0, 0, 200, 548, 20, 0, 0, 0, 310, 980, 1280, 650, 102, 0, 0, 45, 0, 21, 65, 0, 0};
        
        // Legnagyobb sziget bal- és jobboldali partjainak meghatározása
        int nagy = Integer.MIN_VALUE;
        int nagybal = -1, nagyjobb = -1;
        for (int i = 0; i < meresek.length; i++) {
            if (meresek[i] != 0) {
                int bal = i;
                while (i < meresek.length && meresek[i] != 0) {
                    i++;
                }
                int jobb = i - 1;
                if (jobb - bal > nagy) {
                    nagy = jobb - bal;
                    nagybal = bal;
                    nagyjobb = jobb;
                }
            }
        }
        System.out.println("A legszélesebb sziget: " + nagybal + " and " + nagyjobb + ".");
        
        //Legmagasabb sziget
        
        int csucs = Integer.MAX_VALUE;
        System.out.println("A legmagasabb pont: " + csucs);
        
        //Hány sziget van?
        
        int db = 0;
        
        for (int i = 0; i < meresek.length; i++){
            if (meresek[i] > meresek[i+1]){
                db = db + 1;
            }
        }
        System.out.println("Ennyi sziget van összesen: " + db);
    }
    
}
