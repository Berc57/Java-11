/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szigetegyszeru;

/**
 *
 * @author diak
 */
public class Szigetegyszeru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {0,0,200,548,20,0,0,0,310,980,1280,650,102,0,0,45,0,21,65,0,0};
        //Hánya sziget van?
        int c0 = 0;
        
        for(int i = 0; i < list.length; i++){
            if(list[i] != 0 && list[i-1] == 0){
                c0 = c0 + 1;   
            }
        }
        System.out.println("Ennyi sziget van: " + c0);
        
        //Melyik a legmagasabb pont?
        int c1 = 0;
        
        for(int i = 0; i < list.length; i++){
            if (list[i] > c1){
                c1 = list[i];
            } 
        }
        System.out.println("A legmagasabb pontja: " + c1);
        
        //Hol van és mekkora a legmeredekebb emelkedő?
        
        int c2 = 0;
        int plus = 0;
        int helye1 = 0; 
        int helye2 = 0;
        
        for(int i = 0; i < list.length-1; i++){
            plus = Math.abs(list[i+1]-list[i]);
            if(plus > c2){
                c2 = plus;
                helye1 = list[i];
                helye2 = list[i + 1];
            }
        }
        System.out.println("A legmeredekebb emelkedő: " + c2 + " - És itt van: " + helye1 + ", " + helye2);
        
        //Van e völgy
        
        boolean c3 = false;
        int volgy1 = 0;
        int volgy2 = 0;
        int volgy3 = 0;
        
        for(int i = 0; i < list.length-2; i++){
             if(list[i]>list[i+1] && list[i+1] < list[i+2] && list[i+1] != 0){
                 c3 = true;
                 volgy1 = list[i];
                 volgy2 = list[i+1];
                 volgy3 = list[i+2];
             }
        }
        System.out.println("Van e völgy?: " + c3 + " A völgy számai: " + volgy1 + ", " + volgy2 + ", " + volgy3);
         
        //Hol kezdődik az első sziget?
        
        int c4 = 0;
        
        for(int i = 0; i < list.length; i++){
            if(list[i] != 0){
                c4 = list[i];
                break;
            }
        }
        System.out.println("Az első sziget: " + c4);
        
        //Mekkora a legnagyobb sziget?
        
        
        
    }
}
