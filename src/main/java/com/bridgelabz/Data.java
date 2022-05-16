package com.bridgelabz;

enum message{
    HI,
    HELLO
}
public class Data {
    public static void main(String[] args)
    {
        message var=message.HI;
        switch (var){
            case HI:
                System.out.print("HIII i am from bridgelabz");
                break;
            case  HELLO:
                System.out.print("Hello i am from bridgelabz");
                break;
        }
    }

}
