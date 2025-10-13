/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week5And6Sample;

import java.util.Stack;





/**
 *
 * @author Edmundo Dela Cruz
 */
public class StackSampleCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //DSA, Fun, DSA
        
        Stack stack1 = new Stack();
        stack1.add("A");
        stack1.add("B");
        stack1.add(true);
        
        Stack stack = new Stack();
        stack.add("A");
        stack.add(true);
        stack.add("C");
        stack.add("D");
        stack.add(false);
        stack.add(null);

        System.out.println("Stack last instance "+stack);
        System.out.println("What index is Fun located? "+stack.search("Sad"));
        System.out.println("Are all stack1 elements contains in Stack"+stack.containsAll(stack1));
    }
    
}
