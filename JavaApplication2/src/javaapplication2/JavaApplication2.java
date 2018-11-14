/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author BOoll18
 */
public class JavaApplication2 {

   public static int luben3(int i, int n)
    {
        if(i>=n)
        {
            return i;
        }
        return i*luben3(i+1,n);
    }
    public static void main(String[] args) {
        System.out.println(luben3(1,6));
    }
    
}
