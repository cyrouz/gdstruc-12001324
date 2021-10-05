package com.gdstruc.module2;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<String>();


        linkedlist.add("Heathcliff");
        linkedlist.add("Asuna");
        linkedlist.add("LethalBacon");
        linkedlist.add("HPDeskjet");


        System.out.println("Elements:");
        for(String str: linkedlist)
        {
            System.out.println(str);
        }

        Object firstElement = linkedlist.removeFirst();
        System.out.println("\nElement removed: "+ firstElement);

        System.out.println("\nElements:");
        for(String str2: linkedlist){
            System.out.println(str2);
        }

    }
}
