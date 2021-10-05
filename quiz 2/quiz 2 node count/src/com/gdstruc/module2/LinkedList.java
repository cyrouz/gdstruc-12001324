package com.gdstruc.module2;

class LinkedList {
    Node head;

    LinkedList(){
        head = null;
    }

    void push_back(String newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    int countNodes() {
        Node temp = new Node();
        temp = this.head;
        int i = 0;
        while(temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    void PrintList() {
        Node temp = new Node();
        temp = this.head;
        if(temp != null) {
            System.out.print("Elements: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("There are no elements");
        }
    }
};