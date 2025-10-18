/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week7To8;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class binaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        binaryTree tree = new binaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        
        
        //In Order Transversal
        System.out.println("\n In Order Transveral");
        tree.transveralInOrder(tree.root);
        
        //Pre Order Transversal
        System.out.println("\n Pre Order Transveral");
        tree.transversalPreOrder(tree.root);
        
        //Post Order Transversal
        System.out.println("\n Post Order Transveral");
        tree.transversalPostOrder(tree.root);
        
    }
    
}
