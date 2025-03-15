package com.example.collectionQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BPriorityQueue {

    public static void main(String[] args) {
        System.out.println("Input :  10  20  30  40  100  10  60 50  ");

        Queue<Integer>q1 = new PriorityQueue<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(70);
        q1.offer(10);
        q1.offer(60);
        q1.offer(50);

        System.out.println(q1);

        Queue<Integer>q2 = new PriorityQueue<>(Comparator.reverseOrder());

        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        q2.offer(40);
        q2.offer(70);
        q2.offer(10);
        q2.offer(60);
        q2.offer(50);

        System.out.println(q2);


    }
}
