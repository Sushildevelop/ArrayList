package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_strings {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("shushil");
        arrayList.add("ruby");
        arrayList.add("rakesh");
        arrayList.add("swapneel");
        arrayList.add("Khushi");
        System.out.println("Arralist before sorting: ");
        for (String str:arrayList){
            System.out.print(str+" ");
        }
        System.out.println();
        // Sorted list asecending order
//        Collections.sort(arrayList);

        // Sorted list in decreasing
        Collections.sort(arrayList,Collections.reverseOrder());
        for (String str:arrayList){
            System.out.print(str+" ");
        }

    }
}
