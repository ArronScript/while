package com.dmdev.lesson6;

public class WhileExample {
    public static void main(String[] args) {
    int value=5;
    int result= factoeial(value);
        System.out.println(result);
    }
   public static int factoeial(int value){
       int result = 1;
        int i = 1 ;
      while (result<=i){
          result*=i;
          i++;
      }
       return result;
   }

}
