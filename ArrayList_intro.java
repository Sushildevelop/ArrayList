package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_intro {
    public static void main(String[] args) {
//        Collections in Java

//        A group of individaul objects which are represented as a single unit is knwon as the collection of the objects.
//        Java Collection is a single unit of objects.

   //    Interface in Java is a blueprint of a class.

    /*    What is framework
  1. A framework in programming is a structure of ready-made components or solutions that are customized in order to speed up development.
  2. Using Framework saves time and reduces the risk of errors.

   */
        /* Collection Interface
         This interface cannot be implemented directly it is implemented through its subinterfaces like List, Queue and set.

      ArrayList class implements the List interface which is a subinterface of the Collection Interface.

         */

      //  Java Classes which implements List Interface are-

      /*  ArrayList
        LinkedList
        Vector
        Stack

       */

      //  ArrayList is a class which holds the object of the same kind in the order of insertion without any limit to the number of objects to store.


//        Syntax to create ArrayList
       /*         List<AnyClass> list= new ArrayList<AnyClass>();
          It uses a dynamic array data structure to store objects and elements.
          It allows duplicate objects and elements.
        It maintains the insertion order.
                It is non-synchronized.
        Its elements/objects can be accessed randomly.

        */

        //  void add(int index,E element) -> specified element and specified position.

        ArrayList arrayList=new ArrayList();
        System.out.println("Initially the size of arraylist: "+arrayList.size());

        // add elements to the array list
        arrayList.add("P");
        arrayList.add("Q");
        arrayList.add("R");
        arrayList.add(1,"P2");
        System.out.println("size of arrayList after inserting elements: "+arrayList.size());

        // Display the array list
        System.out.println("Elments of arrayList are "+arrayList);
        arrayList.add("10");
        arrayList.add("@");
        System.out.println("Elements of arraylist after inserting 2 elements are "+arrayList);

        // Remove elements from the array list
        arrayList.remove("10");
        arrayList.remove(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList);













    }
}
