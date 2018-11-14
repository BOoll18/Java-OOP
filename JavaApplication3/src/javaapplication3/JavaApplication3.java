/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author BOoll18
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m,d;
        Scanner  enter = new Scanner(System.in);
        m=enter.nextInt();
        d=enter.nextInt();
      if(m>3 || m<6 &&  d>21 || d<21)
        {
            System.out.println("Spring");
        }
        else if(m<6 && m>3 && d<21)
        {
            System.out.println("Spring");
        }
         else  if(m>6 && m<9 && d>21)
        {
            System.out.println("Summer");
        }
         else if( m<9 && m>6&& d<23)
        {
            System.out.println("Summer");
        }
        else  if(m>9 && m<12 && d>23)
        {
            System.out.println("Autumn");
        } 
        else if( m<12 && m>9 && d<21)
        {
            System.out.println("Autumn");
        } 
        else  if(m>12 && m<3 && d>21)
        {
            System.out.println("Winter");
        } 
        else if( m<3 && m>=12 && d<21)
        {
            System.out.println("Winter");
        } 
    }
    
}
