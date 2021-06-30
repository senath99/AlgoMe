package com.company.binarysearch;

public class BinarySearch{

    public static int binary_search(int data[] , int number){
        int first = 0;
        int last = data.length -1;

        while(first <= last){
            int mid  = (first + last) /2;
            if(data[mid] == number)
                return mid;
            else if(data[mid] < number)
                first = mid +1;
            else if(data[mid] > number)
                last = mid-1;

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
        int arrays[] = new int[]{1,2,3,4,5};
        int result = binary_search(arrays,4);
        verify(result);
    }
}