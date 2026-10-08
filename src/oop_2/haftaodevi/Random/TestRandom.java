
package oop_2.haftaodevi.Random;

import java.util.Random;


public class TestRandom {
    public static void main(String[] args) {
       
    Random random = new Random(124 );
    for(int i = 0; i < 50; i++){
    System.out.print(random.nextInt(100) + " ");
}
  
}
     
}
