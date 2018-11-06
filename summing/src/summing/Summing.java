/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summing;

/**
 *
 * @author BOoll18
 */
public class Summing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 100; i++)
        { 
           sum+=i;
           if(sum>100)
           {
               break;
           }
          
        }
        System.out.println(sum);
        
    }
    
}
