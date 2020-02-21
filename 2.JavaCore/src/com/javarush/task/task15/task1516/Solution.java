package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/


public class Solution {

    public int intVar = 1;
    public double doubleVar = 2.0;
    public Double DoubleVar = 1.0;
    public boolean booleanVar= true;
    public Object ObjectVar= 1.0;
    public Exception ExceptionVar = new Exception();
    public String StringVar = "re";




    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.intVar);
        System.out.println(sol.doubleVar);
        System.out.println(sol.DoubleVar);
        System.out.println(sol.booleanVar);
        System.out.println(sol.ObjectVar);
        System.out.println(sol.ExceptionVar);
        System.out.println(sol.StringVar);

    }
}
