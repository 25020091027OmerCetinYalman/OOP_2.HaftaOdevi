
package oop_2.haftaodevi.GregorianCalendar;

import java.util.GregorianCalendar;


public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
            
        
        System.out.println("Yıl: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Ay:" + calendar.get( GregorianCalendar.MONTH));
        System.out.println("Gün :" + calendar.get (GregorianCalendar.DAY_OF_MONTH));
        
        calendar.setTimeInMillis(1234567898765L);
        
        System.out.println("Güncel Yıl: " + calendar.get (GregorianCalendar.YEAR));
        System.out.println("Güncel Ay : " + calendar.get (GregorianCalendar.MONTH));
        System.out.println("Güncel Gün: " + calendar.get (GregorianCalendar.DAY_OF_MONTH));
        
        
    }
    
}
