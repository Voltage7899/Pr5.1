package com.company;

public class Main {
    public static void main(String [] args)
    {
        Main main=new Main();
        int s=0;
       //main.method1(159, s);
        main.method2(625);
    }
    void method1(int i,int s)
    {
        int a=0;
        if(i!=0)
        {
            a=i%10;
            s=s+a;


            method1(i/10,s);
        }
        else{
            System.out.println("sum is "+s );
        }


    }
    void method2(int n)
    {



            int  a=n%10;
            if(a!=0) {
                System.out.print(a);

                method2(n / 10);
            }




    }
}
