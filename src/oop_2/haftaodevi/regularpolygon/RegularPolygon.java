
package oop_2.haftaodevi.regularpolygon;




public class RegularPolygon {
   private int n = 3;
   private double side = 1;
   private double x = 0;
   private double y = 0;
   
   
   public  RegularPolygon(){
       this.n = 3;
       this.side = 1.0;
       this.x = 0.0;
       this.y = 0.0;
   }
       
       
       
       public RegularPolygon(int n, double side){
           this.n = n;
           this.side = side;
           this.x = 0.0;
           this.y = 0.0;
          
       }
       
       public RegularPolygon(int n, double side, double x, double y){
           
           this.n = n;
           this.side = side;
           this.x = x;
           this.y = y;
           
          
       }
       
       public int getn(){
           return this.n;
           
       }
       
       public void setn(int yenin){
           this.n = yenin;
       }
       
       public double getside(){
           return this.side;
       }
       
       public void setside(double yeniside){
           this.side = yeniside;
       }
       
       public double getx(){
           return this.x;
           
       }
       
       
       public void setx(double yenix){
           this.x = yenix;
       }
       
       public double gety(){
           return this.y;
       }
       
       public void sety(double yenin){
           this.y = yenin;
           
       }
           
           public double getPerimeter(){
               return this.n * this.side;
             
           }
           
           public double getArea(){
               return (n * side * side) / (4 * Math.tan(Math.PI / n));
       }
               
   }


class TestRegularPolygon{
    
    public static void main(String[] args) {
        
        
        RegularPolygon polygon1 = new RegularPolygon();
        
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
        
        
        System.out.println(" Cevresi: " + polygon1.getPerimeter() + " Alani: " + polygon1.getArea());
        
        System.out.println(" Cevresi: " + polygon2.getPerimeter() + " Alani: " + polygon2.getArea());
        
        System.out.println(" Cevresi: " + polygon3.getPerimeter() + " Alani: " + polygon3.getArea());
           
        
    }

}
    

