package pack1;

public class FirstOccurrence {

    public static void main(String[] args) {

        FirstOccurrence obj = new FirstOccurrence();
        int[] arrayOfInts = new int[]{2 ,2,2 ,3,4,4,4,6,7,7,7,7,7,7,9,66,78};
//        int[] arrayOfInts = new int[]{};
//        int valueToSearch = 9;
        int valueToSearch = -1;
        int start = 0;
        int end = arrayOfInts.length - 1;
        int mid = (start + end)/2;
        //
        int firstOccurrence = obj.search(arrayOfInts, valueToSearch, start, end, mid);
        int lastOccurrence = obj.search(arrayOfInts, valueToSearch, start, end, mid, true);

        if(firstOccurrence == -1){
            System.out.println(valueToSearch + " is not found");
        }
        else{
            int numberOfOccurrence = (lastOccurrence - firstOccurrence) + 1;
            System.out.println(valueToSearch + " is found " + numberOfOccurrence + (numberOfOccurrence > 1 ? " times": " time"));
        }
    }

    private int result = -1;

    /**
     * int[] : the array in which the number has to be found
     * int : value to be serached
     * int : start index of the array
     * int : end index of the array
     * int : mid index of the array
     * boolean : Flag to indicate if client wants to find first occurrence or last occurrence of the number.
     * False for first occurrence and True for last occurrence.
     *

     */
    public int search(int[] arr, int valueToSearch, int start, int end, int mid){
        return search(arr, valueToSearch, start, end, mid, false);
    }
    public int search(int[] arr, int valueToSearch, int start, int end, int mid, boolean firstOrLast){

        if(end < start){
            return getResult();
        }

        if(arr[mid] == valueToSearch){
            setResult(mid);
            if(firstOrLast == false) {
                return search(arr, valueToSearch, start, mid - 1, (start + (mid - 1)) / 2, firstOrLast);
            }else{
                return search(arr, valueToSearch, mid + 1, end, ((mid +1) + end ) / 2, firstOrLast);
            }
        }

        if(valueToSearch > arr[mid]){

            int newStart = mid + 1;
            int newEnd = arr.length - 1;
            int newMid = (newStart + newEnd)/2;

            return search(arr, valueToSearch, newStart, newEnd, newMid, firstOrLast);
        }

        if(valueToSearch < arr[mid]){

            int newStart = start;
            int newEnd = mid - 1;
            int newMid = (newStart + newEnd)/2;

            return search(arr, valueToSearch, newStart, newEnd, newMid, firstOrLast);
        }

        return -1;
    }
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


}