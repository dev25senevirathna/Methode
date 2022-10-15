/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methode;

/**
 *
 * @author Chathani
 */
public class Methode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int t = my(25,20,18,12,5);
        System.out.println("Total value is="+t);
        
    }
    
    public static int my(int a, int b,int c, int d, int e){
        int max= (a+b+c)-(d+e);
       
        
        return max;
    }
}


