/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d_tomb;

/**
 *
 * @author diak
 */
public class Main {
    public static void asd(){
        System.out.println("---------------------------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] szamok = {{2,9,7},{1,0,3}};
        int i,j;
        int sorokszama = szamok.length;
        int oszlopokszama = szamok[0].length;
        
        //2D tömb bejárása
        System.out.println(szamok.length); //mkátrix mérete
        i = 0;
        asd();
        System.out.println(szamok[i].length); //sor mérete
        
        for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                    System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        asd();
        
        //2. sor bejárása
        
        for (j = 0; j < szamok[1].length; j++){
            System.out.println(szamok[1][j]);
        }
        asd();
        
        // 2. oszlop bejárása
        for (i = 0; i < szamok.length; i++){
            System.out.println(szamok[i][1]);
        }
        asd();
        
        // az egész összege
        int osszeg = 0;
        
        for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                osszeg = osszeg + szamok[i][j];
            }
        }
        System.out.println(osszeg);
        
        asd();
        
        //sorok elemeinek összege
        
        int elsosor = 0;
        int masodiksor = 0;
        
        for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                if (i == 0){
                    elsosor = elsosor + szamok[i][j];
                }
                else if (i == 1){
                    masodiksor = masodiksor + szamok[i][j];
                }
            }
        }
        System.out.println("Első sor: " + elsosor);
        System.out.println("Második sor: " + masodiksor);
        
        asd();
        
        int parosak = 0;
        
        for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                if (szamok[i][j] % 2 == 0){
                    parosak = parosak + 1;
                }
            }
        }
        System.out.println(parosak);
        
        asd();
        
        elsosor = 0;
        masodiksor = 0;
        
        for (i = 0; i < szamok.length; i++){
            for (j = 0; j < szamok[i].length; j++){
                if (i == 0){
                    if (szamok[i][j] % 2 == 0){
                        elsosor = elsosor + 1;
                    }
                }
                else if (i == 1){
                    if (szamok[i][j] % 2 == 0){
                        masodiksor = masodiksor + 1;
                    }
                }
            }
        }
        System.out.println("Első sor: " + elsosor);
        System.out.println("Második sor: " + masodiksor);
        
        asd();
        
        for (i = 0; i < szamok.length; i++){
            for (j = szamok.length; j > -1; j--){
                    System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        asd();
        
        for (j = 0; j < szamok[0].length; j++){
            for (i = 0; i < szamok.length; i++){
                System.out.print(szamok[i][j] + " ");
            }
        }
        System.out.println();
        asd();
        
        int elsooszlop = 0;
        int masodikoszlop = 0;
        int harmadikoszlop = 0;
        
        for (j = 0; j < szamok[0].length; j++){
            for (i = 0; i < szamok.length; i++){
                if (j == 0){
                    elsooszlop = elsooszlop + szamok[i][j];
                }
                else if (j == 1){
                    masodikoszlop = masodikoszlop + szamok[i][j];
                }
                else if (j == 2){
                    harmadikoszlop = harmadikoszlop + szamok[i][j];
                }
            }
        }
        System.out.println("Első oszlop: " + elsooszlop);
        System.out.println("Második oszlop: " + masodikoszlop);
        System.out.println("Harmadik oszlop: " + harmadikoszlop);
            
            
        asd();
        
        //3x5 ös mátrix random számokkal
        
        int[][] numbers = new int[3][5];
        int randomSzam;
        
        for (i = 0; i < 3; i++){
            for (int ot = 0; ot < 5; ot++){
                numbers[i][ot] = randomSzam = (int) (Math.random() * 11) + 0;
                System.out.print(numbers[i][ot] +  " ");
            }
        }
        
    }
    
}
