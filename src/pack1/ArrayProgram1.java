/*

Read me to understand the program:
===================================

It's given an array (indexed from 1) of N elements on which we make M queries:

add(Left, Right, X) - all the elements between the position Left and Right (1<=Left<=Right<=N) are raising their values with X.

After all the operations are completed, print the array.

example

Array: 1 1 1 4 5 6

operations: (1, 5, 2), (2, 3, 10)

Final array: 3 13 13 6 7 6


 */

package pack1;

import java.lang.reflect.Array;

public class ArrayProgram1 {

    public static void main(String[] args) {

        ArrayProgram1 obj = new ArrayProgram1();
        Integer[] arr = new Integer[]{0,2,5,3,6,8,2,7,6,5,4};

        obj.setArr(arr);
        System.out.println("Initial array");
        obj.printArray();

        obj.add(1,2,1);

        obj.add(2,4,10);

        obj.add(3,9,3);

        System.out.println("Final output");
        obj.printArray();
    }

    private Integer[] arr;

    public void add(Integer left, Integer right, Integer valueToAdd){

        arr = getArr();
        for(int i = 1; i <= ((right - left) + 1) ; i++){
            arr[(left-1)+i] = arr[(left-1)+i] + valueToAdd;
        }
    }

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    public void printArray(){
        for(int i = 0; i< this.getArr().length ; i++){
            System.out.println(i + " > "+ arr[i]);
        }
    }
}
