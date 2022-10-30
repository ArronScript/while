package com.dmdev.task;


public class TASK7_1 {
    public static void main(String[] args) {

        int[] value = {1, 2, 44, 54375863};
        printArray(value);
      // printArrayForeach(value);
        printArrayRefresher(value);
    }
public static void printArrayRefresher(int[] value){
    for (int i = value.length -1 ; i >= 0 ; i--) {
        System.out.print(value[i]  + " ");
    }
}
    public static void printArray(int[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }
    /**public static void printArrayForeach(int[] value){
        for (int iowa : value) {
            System.out.print(iowa + " " );
        }
        System.out.println();

    }*/
}