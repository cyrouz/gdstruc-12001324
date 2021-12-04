package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeFirst(){
        if(head != null)
            head = head.getNextPlayer();
    }



    public void printList(){

        PlayerNode current = head;
        int count = 0;
        String Asuna = "Asuna";
        System.out.print("HEAD -> ");

        while (current != null) {

            removeFirst();
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
            count++;
        }

        System.out.println("null");
        System.out.println("Number of elements: ");
        System.out.println(count++);
        System.out.println("Contains Asuna: ");
        String myStr = "Asuna";
        System.out.println(myStr.contains("Asuna"));
        System.out.println("Index for Asuna: " + myStr.indexOf("Asuna"));
    }

}

