
package oop_2.haftaodevi.stopwatch;



public class StopWatch {
    
    private long startTime;
    private  long endTime;
    
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
        
    }
    
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        this.endTime = System.currentTimeMillis();
        
    }
    
    public long getElapsedTime(){
        return this.endTime - this.startTime;
        
    }
    
}
    
 class TestStopWatch{
    
    public static void main(String[] args) {
        
        StopWatch kronometre = new StopWatch();
        
        kronometre.start();
        
        for(int i = 0; i < 100000; i++){
            Math.sqrt(i);
        
        }
        
        kronometre.stop();
        
        System.out.println("Geçen süre:" + kronometre.getElapsedTime() + "Milisaniye");
        
    }
    
    
}
