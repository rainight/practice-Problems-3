package Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack
{
 private List<Integer> stack = new ArrayList<Integer>();
 
 public void push(int number)
 {
     stack.add(number);
     System.out.println(stack);

 }

 public void pop()
 {
     if(stack.isEmpty())
     {
         System.out.println("Underflow");
         return;

     }

     stack.remove(stack.size()-1);
     System.out.println(stack);

 }

 public static void main(String args[])
 {
    Stack stack = new Stack();

    stack.push(1);
    stack.pop();
    stack.pop();
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    stack.pop();


 }

}
