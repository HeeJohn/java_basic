package mycode.basic.chap01;

import java.util.Scanner;


// multiple statements in order -> concatenation


public class Max3 {

    public void run (){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("find max of 3 numbers");
        System.out.print("a : "); int a  = stdIn.nextInt();
        System.out.print("b : "); int b = stdIn.nextInt();
        System.out.print("c : "); int c = stdIn.nextInt();


        int max = a;

        if (b>max) max =b;
        if(c>max) max=c;

        System.out.println("max is " + max);
    }
}
