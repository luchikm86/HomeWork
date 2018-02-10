package com.mluch.javastart.lesson4.hw;

public class CondOfThree {

    public static void main(String[] args) {

        int a = 5, b = 2;

        if (a < b){
            System.out.println("-1");
        } else  if (a == b) {
            System.out.println("0");
        }
        else  if (a > b) {
            System.out.println("+1");
        }
    }
}

//Input - Output
// a = 5, b = 2     +1
