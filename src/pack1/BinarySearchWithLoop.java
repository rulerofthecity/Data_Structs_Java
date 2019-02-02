package pack1;

public class BinarySearchWithLoop {

    public static void main(String[] args) {
        BinarySearchWithLoop obj = new BinarySearchWithLoop();
        int[] arr = new int[]{0, 1,2,3,4,5,6,7,8,9};
        int valueToSearch = 9;
        int size = arr.length;

        int result = obj.search(arr, size, valueToSearch);
        System.out.println("Index " + result);
    }

    private int result = -1;

    public int search(int[] arr, int arraySize, int valueToSearch){

        int start = 0;
        int end = arraySize-1;
        int mid;
        while (start <= end){
            mid = (start + end)/2;

            if(valueToSearch == arr[mid]){
                return mid;
            }else if(valueToSearch > arr[mid]){
                start = mid + 1;
            }else if(valueToSearch < arr[mid]){
                end = mid - 1;
            }
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
