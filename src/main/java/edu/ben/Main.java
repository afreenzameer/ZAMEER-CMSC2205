package edu.ben;

import edu.ben.lab_3.MyLinkedList;
import edu.ben.lab_3.MyList;
import edu.ben.lab_4.MyArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String... args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(String.class);
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 1; i <= 10; i++) {
            linkedList.add(String.valueOf(i));
            arrayList.add(String.valueOf(i));
            myArrayList.add(String.valueOf(i));
            myLinkedList.add(String.valueOf(i));

        }

        System.out.println(linkedList);
        System.out.println(arrayList);



            System.out.println(myArrayList);
        System.out.println(myLinkedList);


        for (int i = 1; i <= 3; i++) {
            linkedList.remove();
            System.out.println(linkedList);

            arrayList.remove(0);
            System.out.println(arrayList);

            myArrayList.remove();
            System.out.println(myArrayList);

            myLinkedList.remove();
            System.out.println(myLinkedList);


        }
        linkedList.clear();
        arrayList.clear();
        myArrayList.clear();
        myLinkedList.clear();

        System.out.println(linkedList);
        System.out.println(arrayList);
        System.out.println(myArrayList);
        System.out.println(myLinkedList);
    }

    // Some differences I noticed between the list outputs were in the remove method. In MyLinkedList and MyArrayList the remove method removed the last value in the list, while in ArrayList and LinkedList the first values were removed. There was also the small difference that ArrayList and LinkedList had the list surrounded by brackets and were comma separated while MyLinkedList and MyArrayList did not. 

}

