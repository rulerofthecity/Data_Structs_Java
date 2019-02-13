package pack1;

import java.util.ArrayList;

public class MajorityElement {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,1);
        arr.add(1,1);
        arr.add(2,4);
        arr.add(3,4);
        arr.add(4,4);
        arr.add(5,1);
        arr.add(6,4);
        arr.add(7,1);
        arr.add(8,4);
        arr.add(9,1);
        arr.add(10,1);
        arr.add(11,1);
        arr.add(12,4);

        findMajorityElement(arr);


    }

    public static void findMajorityElement(ArrayList<Integer> list){

        //sorting the array
        Sorting sorter = new Sorting();
        sorter.sort(list);

        System.out.println(list);
        int size = list.size();
        int majorityElemIndex = (size/2)+1;
        System.out.println(majorityElemIndex);
        int majorityElem = list.get(majorityElemIndex);

        int occurrences = -1;
        for(Integer i : list){
            if(i.equals(majorityElem)) occurrences++;
        }
        System.out.println("Majority element : " +  majorityElem);
        System.out.println("Number of occurrences : " + occurrences);

    }

}
