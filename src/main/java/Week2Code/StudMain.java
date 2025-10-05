/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week2Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class StudMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       studentsSample[] arr;
       
       arr = new studentsSample[3];
       
       //Set first stuent data
       arr[0] = new studentsSample(1234, "Ed");
       arr[1] = new studentsSample(4567, "Dela");
       arr[2] = new studentsSample(7777, "Cruz");
       
       for (int i = 0; i <arr.length; i++){
           System.out.println("Element at " + i +" :"
                              + arr[i].studName + " "
                              + arr[i].studNumber);        
       }
     }
    
}
