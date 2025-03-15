package com.example.collectionQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ALinkedListQueue {

    //Order Collection : But can be changed if defined priority

    public static void main(String[] args) {

        Queue<Integer>queue1 = new LinkedList<>();

        /*
            public class LinkedList<E> implements List<E>, Deque<E>
            public interface Deque<E> extends Queue<E>
         */

        System.out.println("Input :  10  20  30  40  100  10  60 50  ");
        queue1.offer(10);
        queue1.offer(20);
        queue1.offer(30);
        queue1.offer(40);
        queue1.offer(100);
        queue1.offer(10);
        queue1.offer(60);
        queue1.offer(50);


        System.out.println("Peak of Queue : "+queue1.peek());

        System.out.println(queue1);

        System.out.println("Poll : Remove Element ");
        queue1.poll();
        System.out.println(queue1);






    }
}
