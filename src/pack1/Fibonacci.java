package pack1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String name = new String();
        // Reading data using readLine
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(fibonacci(Integer.valueOf(name)));
    }

    public static ArrayList<Integer> fibonacci(Integer number){

        ArrayList<Integer> list = new ArrayList<>();
        Integer item = 1;
        list.add(item);
        list.add(item);
        while(item < number){
            item = list.get(list.size() - 1) + list.get(list.size() - 2);
            if(item < number)
                list.add(item);
            else
                break;
        }
        return list;
    }
}
