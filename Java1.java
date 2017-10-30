package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
	// write your code here
      // System.out.println("Hello world!");
        //  System.out.println("I try to make my homework!");
        //byte num = 3;
        //String str= "Hello mir!!!";
        // System.out.print("num=");
        //System.out.println(num);
        //System.out.print(str);
        Scanner num= new Scanner(System.in);
      int x,y,result1,result2,result3;
      System.out.print("Vvesti pervoe chislo: ");
              x= num.nextInt();
        System.out.print("Vvesti vtoroe chislo: ");
                y= num.nextInt();
        result1= x+y;
        System.out.println("Result slojeniya is - "+result1 );
        result2= x*y;
        System.out.println("Result umnojeniya is - "+result2 );
        result3= x%y;
        System.out.println("Result ostatok is - "+result3 );
        if (result1 >= result3){
            System.out.print("Result 1 bolshe result 3 i raven -" );
            System.out.print(result1 );
        }
            else {
            System.out.print("Result 3 bolshe result 1 i raven - ");
            System.out.print(result3);
        }
                switch(result1){
                    case 3:
                    case 4:
                    case 12:
                    case 9:
                    case 15:
                    case 7:
                        System.out.println("\n" );
            System.out.println("Pora bi svernut s puti " );
            break;
                                       }

    }
}
