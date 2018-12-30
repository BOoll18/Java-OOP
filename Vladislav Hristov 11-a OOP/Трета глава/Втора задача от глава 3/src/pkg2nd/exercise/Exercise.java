/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2nd.exercise;

/**
 *
 * @author BOoll18
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number=2;
        boolean flag=number%5==0 && number%7==0;// може да напишем само number%35==0
        if(flag=true)
        {
           System.out.println("The number devides by 5 and 7");
           
        }
        else
        {
            System.out.println("The number doesn't devides by 5 and 7");
            
        }
    }
    
}
