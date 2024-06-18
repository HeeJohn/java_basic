import basic.chap01.Max3;
import basic.chap01.Max4;
import basic.chap01.Min4;

class Main{
    public static void main(String[] args){
        Max3 m = new Max3();
        Max4 m4 = new Max4();
        Min4 min4 = new Min4();

        int result1 =  m4.getMax4(1,2,3,4);
        int result2 = min4.getMin4(1,2,3,4);

        System.out.println("find max value: " + result1);
        System.out.println("find min value: " + result2);

        m.run();
    }
}