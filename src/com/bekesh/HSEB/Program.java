/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bekesh.HSEB;

import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sci, eng, nep, cmath, opt, total, per;
        System.out.println("please enter marks of science");
        sci = sc.nextFloat();
        System.out.println("please enter marks of english");
        eng = sc.nextFloat();
        System.out.println("please enter marks of nepali");
        nep = sc.nextFloat();
        System.out.println("please enter marks of cmath");
        cmath = sc.nextFloat();
        System.out.println("please enter marks of opt");
        opt = sc.nextFloat();
        total=sci+eng+nep+cmath+opt;
        
        if(sci<=32||eng<=32||nep<=32||cmath<=32||opt<=32)
        {
            System.out.println("fail");
        }else{
        per = (total/5)*100;
            System.out.println("Percentage is:"+ per);
        
        if(per>=80 && per<=100)
                {
                    System.out.println("dist");  
                }
        else if(per>=60 && per<=80)
                {
                    System.out.println("first");  
                }
        else if(per>=50 && per<=60)
                {
                    System.out.println("second");  
                }
        
        else if(per>=40 && per<=50)
                {
                    System.out.println("third");  
                }
        else if(per>=30 && per<=40)
                {
                    System.out.println("fail");  
                }
    }
    
}
}