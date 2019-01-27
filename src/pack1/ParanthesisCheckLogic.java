package pack1;

import java.util.HashMap;
import java.util.HashSet;

public class ParanthesisCheckLogic {

    private HashMap<String,String> map = new HashMap<>();
    private HashSet<String> openingBrackets = new HashSet<>();
    private HashSet<String> closingBrackets = new HashSet<>();

    public ParanthesisCheckLogic(){setMap();}

    public static void main(String[] args) {

        ParanthesisCheckLogic obj = new ParanthesisCheckLogic();
        System.out.println("Evaluted to be : " + obj.checkParanthesis("[{()}]()[({)]"));
    }

    private boolean checkParanthesis(String exp){

        MyStack<String> stack = new MyStack<>();

        char[] arr = exp.toCharArray();
        for(int i = 0; i < arr.length ; i++){

            String c = String.valueOf(arr[i]);
            if(openingBrackets.contains(c)){
                stack.push(c);
            }
            else if(closingBrackets.contains(c)){

                if(stack.isEmpty() || !map.get(stack.top()).equals(map.get(c)) ){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    private void setMap(){
        map.put("{","1");
        map.put("}","1");

        map.put("[","2");
        map.put("]","2");

        map.put("(","3");
        map.put(")","3");

        openingBrackets.add("{");
        openingBrackets.add("[");
        openingBrackets.add("(");

        closingBrackets.add("}");
        closingBrackets.add("]");
        closingBrackets.add(")");
    }
}
