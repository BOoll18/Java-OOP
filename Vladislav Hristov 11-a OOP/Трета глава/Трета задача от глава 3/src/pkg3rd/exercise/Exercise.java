/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3rd.exercise;

/**
 *
 * @author BOoll18
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 22322708;
        int n1 = number%1000;
        int n2=n1/100;
        int n3=n2%10;
        if(n3==7)
        {
            System.out.println("Yes the third digit of the number is 7");
        }
        else
        {
            System.out.println("No the third digit of the number is not 7");
        }
    }
    
}
