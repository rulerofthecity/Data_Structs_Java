package pack1;

import java.util.ArrayList;
import java.util.Random;

public class Sorting {

    public static  void main(String[] args){
        Sorting obj = new Sorting();
        obj.funct1();
    }

    public void funct1(){

        ArrayList<Integer> arr = getArrayWithRandomNumbers(10);
        System.out.println("--- Random number arrays ---");

        ArrayList<Integer> arr1 = new ArrayList<Integer>(10);

        //Initializing all the elements array with 0
        for(int i = 0; i < 10 ; i++){
            arr1.add(0);
        }

        for(int i = 0; i < arr.size(); i++){

            int index = arr.get(i);
            int oldValue = arr1.get(arr.get(i));
            int newValue = oldValue + 1;

            arr1.set(index,newValue);

        }

        System.out.println("--- Appearance Array ---");
        System.out.println(arr1);

        //sorting
        sort(arr1);
//        for(int i = 0; i < arr1.size(); i++){
//            for(int j = i+1; j < arr1.size(); j++){
//
//                if(arr1.get(i) > arr1.get(j) ){
//                    Integer val1 = arr1.get(i);
//                    arr1.set(i, arr1.get(j));
//                    arr1.set(j,val1);
//                }
//
//            }
//        }
        System.out.println("--- Sorted Appearance Array ---");
        System.out.println(arr1);

    }

    public ArrayList<Integer> getArrayWithRandomNumbers(int sizeOfArray){

        Random random = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>(sizeOfArray);
        for(int i = 0; i < 5; i++){
            lst.add(random.nextInt(sizeOfArray));

        }
        return lst;

    }

    public void sort(ArrayList<Integer> arr){

        //sorting
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){

                if(arr.get(i) > arr.get(j) ){
                    Integer val1 = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j,val1);
                }
            }
        }

    }
}
