package Queue;

import java.util.ArrayList;
import java.util.List;
 
public class Deque {
 
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void insertLeft(int item){
        System.out.println("adding at left: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }
     
    public void insertRight(int item){
        System.out.println("adding at right: "+item);
        deque.add(item);
        System.out.println(deque);
    }
     
    public void removeLeft(){
        if(deque.isEmpty()){
            System.out.println("underflow");
            return;
        }
        int rem = deque.remove(0);
        System.out.println("removed from left: "+rem);
        System.out.println(deque);
    }
     
    public void removeRight(){
        if(deque.isEmpty()){
            System.out.println("underflow!");
            return;
        }
        int rem = deque.remove(deque.size()-1);
        System.out.println("removed from left: "+rem);
        System.out.println(deque);
    }
     
    public int peakLeft(){
        int item = deque.get(0);
        System.out.println("Element at first: "+item);
        return item;
    }
     
    public int peakright(){
        int item = deque.get(deque.size()-1);
        System.out.println("Element at right: "+item);
        return item;
    }
     
    public static void main(String a[]){
         
        Deque deque = new Deque();
        deque.insertLeft(34);
        deque.insertRight(45);
        deque.removeLeft();
        deque.removeLeft();
        deque.removeLeft();
        deque.insertLeft(21);
        deque.insertLeft(98);
        deque.insertRight(5);
        deque.insertLeft(43);
        deque.removeRight();
    }
}