/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week3to4Code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class linkedListExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> collect = new ArrayList();
        collect.add(100);
        collect.add(200);
        
        LinkedList<Integer> ll = new LinkedList(collect);
        ll.add(99);
        ll.add(101);
        ll.add(102);
        ll.remove(1);
        
        System.out.println("LinkedList is "+ll);
    }
    
}
