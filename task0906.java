package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] st = Thread.currentThread().getStackTrace();

        System.out.println(st[2].getClassName() + ": " + st[2].getMethodName() + ": " + s);

        //com.javarush.task.task09.task0906.Solution: main: In main method

    }
}
