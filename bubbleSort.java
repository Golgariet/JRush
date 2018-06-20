package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам

Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        for (int i=0; i<array.length;i++)
        {
            if(!isNumber(array[i]))
            {
                for(int j =  i; j < array.length ; j++)
                {
                    if(!isNumber(array[j]))
                    {
                        if (isGreaterThan(array[i], array[j]))
                        {
                            String buff = array[i];
                            array[i] = array[j];
                            array[j] = buff;
                        }
                    }
                }
            }
            if(isNumber(array[i]))
            {
                for(int j =  i; j < array.length ; j++)
                {
                    if(isNumber(array[j]))
                    {
                        if (Integer.parseInt(array[i])<Integer.parseInt(array[j])) {
                            String buff = array[i];
                            array[i] = array[j];
                            array[j] = buff;
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}

//Пример ввода:
//Вишня
//1
//Боб
//3
//Яблоко
//22
//0
//Арбуз
//
//Пример вывода:
//Арбуз
//22
//Боб
//3
//Вишня
//1
//0
//Яблоко
