/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author BOoll18
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
 static void printNum(int n) 
    { 
        if(n > 0) 
        { 
            printNum(n - 1); 
            System.out.print(n + " "); 
        } 
        return; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n;
        Scanner  enter = new Scanner(System.in);
        n=enter.nextInt();
        printNum(n); 
    } 
    
}
