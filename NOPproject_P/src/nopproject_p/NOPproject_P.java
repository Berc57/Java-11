/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nopproject_p;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class NOPproject_P {

    public static int sorrend(int num) {
        int reversed = 0;
        for(;num != 0; num /= 10) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        }
    return reversed;
    }

        
    public static void main(String[] args) {
        
    }
    
}
