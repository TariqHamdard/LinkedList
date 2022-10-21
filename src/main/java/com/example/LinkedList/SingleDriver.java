package com.example.LinkedList;

public class SingleDriver {

    public static void main(String[] args){

        LinkedList<String> linkedlist = new SinglyLinkedList<>();

        linkedlist.addFirst("first");
        linkedlist.addFirst("second");
        linkedlist.addFirst("third");
        linkedlist.addFirst("fourth");
        linkedlist.addFirst("fifth");

        System.out.println(linkedlist);

        linkedlist.addLast("sixth");
        linkedlist.addLast("seventh");
        linkedlist.addLast("eigth");

        System.out.println(linkedlist);

        linkedlist.pollFirst();


        System.out.println(linkedlist);

        linkedlist.pollLast();

        System.out.println(linkedlist);


    }
}
