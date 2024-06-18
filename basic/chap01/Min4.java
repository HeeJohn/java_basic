package basic.chap01;

import java.util.Scanner;

public class Min4 {

    public int getMin4(int a, int b, int c, int d){

        Scanner sc = new Scanner(System.in);

        System.out.println("find min of 4 numbers");


        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        if(d<min) min = d;
        return min;
    }
}
