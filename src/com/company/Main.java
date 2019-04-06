package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(canPack(0,5,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(((bigCount * 5) + smallCount) < goal || (goal < 0)|| (bigCount < 0)|| (smallCount < 0))
            return false;

        if (((bigCount * 5) == goal) || smallCount == goal || ((bigCount * 5) + smallCount) == goal)
            return true;

        for (int i = bigCount; i >= 0; i--) {
           // System.out.println("big count = " + i);
            for (int j = smallCount; j >= 0; j--) {
                //System.out.println("small count = " + j);
                if(((i* 5) + j) == goal){
                    return true;
                }
            }

        }
       return false;

    }
}
