
package oop_2.haftaodevi.testıntersectingpoint;

import oop_2.haftaodevi.linearequation.LinearEquation;
import java.util.Scanner;


 
public class TestIntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        
        
        double a =y1-y2;
        double b =x1-x2;
        double c =y3-y4;
        double d =x3-x4;
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;
        
        LinearEquation ornek = new LinearEquation(a, b, c, d, e, f);
        
        if(ornek.isSolvable()){
            System.out.println("The intersecting point is at" + ornek.getX() + "," + ornek.getY() + ")" );
        }else{
            System.out.println("The two lines are parallel");
        }
        
    }
    
}
