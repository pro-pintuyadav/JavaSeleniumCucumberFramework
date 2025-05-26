package com.prevails;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String strTest="asdasdadadadd";
       Map<Character, Integer> charsCount = new HashMap<>();
       for(char ch: strTest.toCharArray())
       {
           if(charsCount.containsKey(ch))
           {
               charsCount.put(ch,charsCount.get(ch)+1);
           }
           else
           {
               charsCount.put(ch,1);

           }
       }
        System.out.println(charsCount);
    }
}