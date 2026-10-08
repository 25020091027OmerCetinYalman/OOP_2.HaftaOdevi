package oop_2.haftaodevi.location;

import java.util.Scanner;

public class TestLocation {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dizideki satir ve sutun sayisini girin.");
        int rows = input.nextInt();
        int columns = input.nextInt();
        
        double[][] array = new double[rows][columns];
        
        System.out.println("Diziyi girin:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = input.nextDouble();
            }
        }
        
        location loc = location.locateLargest(array);
        
        System.out.println("The location of the largest element is" + loc.maxValue + " at (" + loc.row + "," + loc.column + ")");
        
    }
    
}
