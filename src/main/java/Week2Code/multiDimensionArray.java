/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week2Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class multiDimensionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int[][] multiDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for(int i = 0; i <multiDimArray.length; i++){
        
        for(int j = 0; j <multiDimArray[i].length; j++){
            System.out.println(multiDimArray[i][j] + " ");
            Thread.sleep(500);
        }    
            System.out.println();
    }
        
    }
    
}
