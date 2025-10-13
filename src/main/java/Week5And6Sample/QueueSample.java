/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week5And6Sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class QueueSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new PriorityBlockingQueue<>();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add(null);
        
        
        System.out.println("Queue elements are "+q);
        q.remove("B");
        System.out.println("Second instance Queue elements are "+q);
    }
    
}
