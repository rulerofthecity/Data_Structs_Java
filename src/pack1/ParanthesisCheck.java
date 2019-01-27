package pack1;

import java.util.ArrayList;

public class ParanthesisCheck {

    public static void main(String[] args) {

        ParanthesisCheck obj = new ParanthesisCheck();
        obj.checkBrackets("{[]}");
    }

    private String[] brackets = new String[]{

            "[", "]",
            "{", "}",
            "(", ")"

    };

    public void checkBrackets(String expression){

        MyStack<String> stack = new MyStack<>();

        char[] arr = expression.toCharArray();
        for(int i = 0; i < expression.toCharArray().length ; i++){

            char c = arr[i];

            if(stack.isEmpty() && i == arr.length-1 ){
                System.out.println("Error -- 1");
            }

            if(stack.isEmpty())

            if(stack.isEmpty() || verifyCorrectBracket(c, stack.top().charAt(0))){
                stack.push(String.valueOf(c));
            }
            else{
                System.out.println("Error");
            }

            System.out.println(stack);

        }



    }

    private boolean verifyCorrectBracket(char newBracket, char topOfStack){

        if(newBracket == topOfStack){
            return true;
        }

        char closingBracket = '`';
        for(int i = 0; i < brackets.length; i++) {

            if (newBracket == brackets[i].charAt(0)) {
                //corresponidng closing bracket
                closingBracket = brackets[i + 1].charAt(0);
            }
        }

        if(topOfStack == closingBracket){
            return true;
        }

        for(int i = 0; i < brackets.length; i++) {

            if(newBracket == brackets[i].charAt(0) && i % 2 == 0 ){
                return true;
            }
        }

        return false;
    }

}

