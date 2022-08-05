package com.vems;
import java.util.*;
 class oops {
     void vemss (String h){

        System.out.println(h.concat(" Thanks for your valuable time"));
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        int x,op;
        String h;
        System.out.println("Enter your name");
        h = sc.nextLine();
        System.out.println("Enter your age");
        x= sc.nextInt();
        System.out.println("Enter phone number");
        op = sc.nextInt();
        otp ver = new otp();
        ver.verify();
        age vote = new age();
        vote.check(x,h);
        oops t = new oops();
        t.vemss(h);

     }
    public static void main(String[] args){
       oops h1 = new oops();
       h1.input();



           }
}
