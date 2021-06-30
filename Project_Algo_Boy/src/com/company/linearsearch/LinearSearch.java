package com.company.linearsearch;

public class LinearSearch{

    public static int linear_search(int [] data, int number){
        for(int i =0; i < data.length ; i++){
            if(data[i] == number)
                return i;
        }
        return -1;
    }

    public static void verify(int result){
        if(result == -1)
            System.out.println("Number is not available");
        else
            System.out.println("Index is  "+result);
    }

    public static void main(String[] args){
        int[] intArray = new int[]{5,6,8,2,3,5,7,7};

        int result = linear_search(intArray,7);
        verify(result);
    }
}