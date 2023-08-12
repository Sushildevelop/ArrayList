package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    static void reverseList(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
  /*      ArrayList<Integer>list=new ArrayList<Integer>();

        list.add(new Integer(0));
        list.add(new Integer(10));
        list.add(new Integer(3));
        list.add(new Integer(5));
        list.add(new Integer(22));
        System.out.println("Before reverse: ");

//        reverseList(list);
//        System.out.println("After revrse: ");
//        print(list);

   */


//        In bulit method
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Before reverse");
        print(list);
        System.out.println(" ");
        Collections.reverse(list);
        System.out.println("After reverse: ");
        print(list);



    }
}
