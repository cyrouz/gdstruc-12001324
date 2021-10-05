package com.gdstruc.module2;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<String>();


        linkedlist.add("Heathcliff");
        linkedlist.add("Asuna");
        linkedlist.add("LethalBacon");
        linkedlist.add("HPDeskjet");


        System.out.println("LinkedList:" + linkedlist);

        System.out.println("\nDoes the List contains 'Asuna': "
                + linkedlist.contains("Asuna"));
        System.out.println("Does the List contains 'HPDeskjet': "
                + linkedlist.contains("HPDeskjet"));

        System.out.println("\nThe player 'Asuna' is at index: "
                + linkedlist.indexOf("Asuna"));
        System.out.println("The player 'HPDeskjet' is at index: "
                + linkedlist.indexOf("HPDeskjet"));
    }
}
