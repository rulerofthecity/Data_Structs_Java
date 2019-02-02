package pack1;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();
        int[] arrayOfInts = new int[]{0, 2,6,7,7,9,99,345,788,788};
//        int[] arrayOfInts = new int[]{};
        int valueToSearch = 788;
        int start = 0;
        int end = arrayOfInts.length;
        int mid = (start + end)/2;
        int ind = obj.search(arrayOfInts, valueToSearch, start, end, mid);

        System.out.println("Index : " + (ind == -1?"Number not found": ind));
    }

    private int result = -1;

    public int search(int[] arr, int valueToSearch, int start, int end, int mid){

        if(end < start){
            return getResult();
        }

        if(arr[mid] == valueToSearch){
            setResult(mid);
            return search(arr, valueToSearch, start, mid -1, (start + (mid -1 ))/2);
        }

        if(valueToSearch > arr[mid]){

            int newStart = mid + 1;
            int newEnd = arr.length;
            int newMid = (newStart + newEnd)/2;

            return search(arr, valueToSearch, newStart, newEnd, newMid);
        }

        if(valueToSearch < arr[mid]){

            int newStart = start;
            int newEnd = mid - 1;
            int newMid = (newStart + newEnd)/2;

            return search(arr, valueToSearch, newStart, newEnd, newMid);
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
