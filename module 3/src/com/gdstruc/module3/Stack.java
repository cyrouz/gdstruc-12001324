package com.gdstruc.module3;

import java.util.LinkedList;
import java.util.ListIterator;

public class Stack {
    private LinkedList<Card> stack;

    public Stack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();
        System.out.println("Printing stack:");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
