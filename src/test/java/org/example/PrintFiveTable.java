package org.example;

public class PrintFiveTable {


    public static void main(String[] srgs){
        int fiveTable;
        int num =5;
        for(int i=1; i<=10; i++){
            fiveTable = num*i;
            if(fiveTable == 25){
                continue;
            }
            System.out.println(fiveTable);
        }
    }

}
