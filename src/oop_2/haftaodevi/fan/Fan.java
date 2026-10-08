package oop_2.haftaodevi.fan;



public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getspeed() {
        return this.speed;
    }

    public void setspeed(int yenispeed) {
        this.speed = yenispeed;
    }

    public boolean geton() {
        return this.on;
    }

    public void seton(boolean yenion) {
        this.on = yenion;
    }

    public double getradius() {
        return this.radius;
    }

    public void setradius(double yeniradius) {
        this.radius = yeniradius;
    }

    public String getcolor() {
        return this.color;
    }

    public void setcolor(String yenicolor) {
        this.color = yenicolor;
    }

    public String toString() {

        if (this.on == true) {
            return (" Hiz:" + this.speed + " Yaricapi:" + this.radius + " Renk:" + this.color);

        } else {
            return (" Yaricap:" + this.radius + " Renk:" + this.color +  " fan is off");

        }

    }

}

class TestFan {

    public static void main(String[] args) {

        Fan fan1 = new Fan();

        fan1.setspeed(3);
        fan1.setradius(10.0);
        fan1.setcolor("yellow");
        fan1.seton(true);

        System.out.println(fan1.toString());

        Fan fan2 = new Fan();

        fan2.setspeed(2);
        fan2.setradius(5.0);
        fan2.setcolor("blue");
        fan2.seton(false);

        System.out.println(fan2.toString());

    }

}
