package com.company.customarray;

public class Array {

    private int array[];
    private static int count;

    public Array(int length){
        array = new int[length];
    }

    public  void printArray(){
        for(int i=0 ; i < count ; i++)
            System.out.println(array[i]);
    }

    public  void insert(int value){
        if(count == array.length){
            int newArray[]  = new int[2 * count];
            for(int i =0 ; i< count ;i++){
              newArray[i] = array[i];
            }
          array = newArray;
        }
        array[count] = value;
        count++;
    }

    public void delete(int index){
        if(index < 0 || index >= count )
            throw new IllegalArgumentException();
        for(int i=index; i < count ; i++){
            array[i] = array[i+1];
        }
       count--;
    }

    public void update(int index, int value){
        array[index] = value;
    }

    public static void main(String [] args){

        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.delete(2);
        System.out.println("===============================");

        array.printArray();
    }
}
