package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        byte b1;
        b1=52;

        int a=676;
        a=a+b1;

        float f1=136352545;

        double d1=5.54*10e6;

        boolean z=true;

        /* || - OR
        && - AND
         */

        boolean p= true&&false;
        boolean q = true||false;

        char c = 't';
        /* \n new line
        \t tab

         */
        String abc= "my text \n haha";
        System.out.println("c=" + c +", abc=" + abc);


        System.out.println("b1=" + b1);
        System.out.println("a=" + a);
        System.out.println("f1=" + f1);
        System.out.println("d1=" + d1);

        int a2 = 5656;
        Integer a3 = 5656;

        a3= a2+a3;
        a2=a3+a2;
        System.out.println("a3=" + a3);


        //System.out.println("Hello");
    }
}
