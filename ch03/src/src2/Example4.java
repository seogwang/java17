package src2;

public class Example4 {
    public static void main(String[] args) {

        for(int a=1;a<=31;a++) {
            System.out.print(a+"\t");
            if(a%7==0) System.out.print("\n");
        }

        // 외부 변수 안 쓰고, 중첩 for문만 써서 달력 만들어 보자.


        /*

        1   2   3   4   5   6   7
        8   9   10  11  12  13  14
        15  16  17  18  19  20  21
        22  23  24  25  26  27  28
        29  30  31

         */
        System.out.print("\n\n\n");

        for(int a=1;a<=5;a++){
            for(int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*
        *
        **
        ***
        ****
        *****
        */

        System.out.print("\n\n\n");

        for(int a=5;a>=0;a--){
            for(int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*
        *****
        ****
        ***
        **
        *
         */

        for(int a=1;a<=9;a++){
            for(int b=2;b<=9;b++){
                System.out.print(b+"X"+a+" = "+(b*a)+" \t");
            }
            System.out.println();
        }

        /*

        구구단
        2X1=2 3X1=3 ...... 9X1=9
        ........................
        2X9=18 3X9=27 ...... 9X9=81

         */

    }
}
