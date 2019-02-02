package pack1;

public class FirstOccurrenceWithLoop {

    public static void main(String[] args) {
        FirstOccurrenceWithLoop obj = new FirstOccurrenceWithLoop();
        int[] arr = new int[]{0,1,2,3,6,6,6,7,8,9};
        int valueToSearch = 1;
        int size = arr.length;

        int firstOccurrence = obj.search(arr, size, valueToSearch);
        int lastOccurrence = obj.search(arr, size, valueToSearch,true) ;

        if(firstOccurrence == -1){
            System.out.println(valueToSearch + " is not found");
        }
        else{
            int numberOfOccurrence = (lastOccurrence - firstOccurrence) + 1;
            System.out.println(valueToSearch + " is found " + numberOfOccurrence + (numberOfOccurrence > 1 ? " times": " time"));
        }

    }

    public int search(int[] arr, int arraySize, int valueToSearch){
        return search(arr,arraySize,valueToSearch, false);
    }

    public int search(int[] arr, int arraySize, int valueToSearch, boolean firstOrLast){

        int result = -1;
        int start = 0;
        int end = arraySize-1;
        int mid;
        while (start <= end){
            mid = (start + end)/2;

            if(valueToSearch == arr[mid]){
                result = mid;
                if(firstOrLast == false){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }else if(valueToSearch > arr[mid]){
                start = mid + 1;
            }else if(valueToSearch < arr[mid]){
                end = mid - 1;
            }
        }
        return result;
    }

}
