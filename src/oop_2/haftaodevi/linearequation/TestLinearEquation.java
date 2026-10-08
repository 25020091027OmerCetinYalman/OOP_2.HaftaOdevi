
package oop_2.haftaodevi.linearequation;

import java.util.Scanner;


public class TestLinearEquation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print(" Lutfen  a, b, c, d, e ve f degerlerini girin: ");
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        LinearEquation sayial = new LinearEquation(a,b,c,d,e,f);
        
        if(sayial.isSolvable()){
            System.out.println("x : " + sayial.getX() + " y : " + sayial.getY());
        }else{
            System.out.println("Denklemin cozumu yoktur.");
        }
    }
}

