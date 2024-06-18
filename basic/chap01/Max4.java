package basic.chap01;

import java.util.Scanner;

public class Max4 {

    public int getMax4(int a, int b, int c, int d){
        Scanner sc = new Scanner(System.in);

        System.out.println("find max of 4 numbers");

        int max = a;
        if(b>max) max = b;
        if(c>max) max= c;
        if(d>max) max=d;

        return max;

    }
}
