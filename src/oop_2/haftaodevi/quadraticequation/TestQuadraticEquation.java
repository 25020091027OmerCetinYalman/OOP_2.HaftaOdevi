package oop_2.haftaodevi.quadraticequation;
import java.util.Scanner;


public class TestQuadraticEquation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US); // Olur da kullanıcı sayıyı virgüllü değilde noktalı şekilde girerse hata almasın diye bu satır var.
        
        System.out.print(" a, b ve c degerlerini girin :");
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        QuadraticEquation denklem = new QuadraticEquation(a,b,c);
        double discriminant = denklem.getDiscriminant();
        
        if(discriminant > 0){
            System.out.println("Denklemin iki kökü vardir. " + denklem.getRoot1() + " ve " + denklem.getRoot2());
        }else if(discriminant == 0 ){
            System.out.println("Denklemin tek kökü vardir." + denklem.getRoot1());
        }else{
            System.out.println("Denklemin kökü yoktur. ");
        }
    }
    
}
