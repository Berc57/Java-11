
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diak
 */
public class NFL {
    try{
    RandomAccessFile file= new RandomAccessFile("NFL_iranyitok.txt","rw");
            } 
catch (Exception e) {
    System.out.println("HIBA!" +e);
}
}
