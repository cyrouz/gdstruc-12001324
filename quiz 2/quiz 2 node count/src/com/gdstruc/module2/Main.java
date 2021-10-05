package com.gdstruc.module2;


public class Main {

    public static void main(String[] args)
    {
        LinkedList PlayerLinkedList = new LinkedList();

        PlayerLinkedList.push_back("Heathcliff");
        PlayerLinkedList.push_back("Asuna");
        PlayerLinkedList.push_back("LethalBacon");
        PlayerLinkedList.push_back("HPDeskjet");


        PlayerLinkedList.PrintList();

        System.out.println("No. of elements: "+ PlayerLinkedList.countNodes());
    }
}