package com.example;

public class Main {


     public static void main(String[] args) {
         String str1 = "J@va the be$t!123"; // создается строка str1, которая содержит текст
         String result = StringUtil.reverseOnlyLetters(str1); // создал статический метод, в него передается строка
         System.out.println(result); // результат метода сохраняется в переменную result и выводит ее
     }


 }



