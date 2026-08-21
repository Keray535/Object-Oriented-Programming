public class Clock {
    private int h;      
    private int min; 
 
    public int getMin() {
       return min;
    }
 
    public int getH() {
       return h;
    }
 
    
    public Clock(int h, int min) {
       this.h = (h + min / 60) % 24;
       this.min = min % 60;
    }
 
    public Clock(int min) {
       this(0, min);
    }
 
    public Clock(String time) {
       String[] parts = time.split(":");
       this.h = Integer.parseInt(parts[0]) % 24;
       this.min = Integer.parseInt(parts[1]) % 60;
    }
 
   
    public Clock add(int min) {
       return new Clock(this.h, this.min + min);
    }
 
    public Clock add(Clock c) {
       return new Clock(this.h + c.h, this.min + c.min);
    }
 
    public String toString() {
       return String.format("%02d:%02d", h, min);
    }
 
    public static void main(String[] args) {
       Clock c1 = new Clock(23, 50);
       Clock c2 = new Clock("10:45");
       Clock c3 = new Clock(120);
       
       System.out.println("c1: " + c1);
       System.out.println("c2: " + c2);
       System.out.println("c3: " + c3);
       
       Clock c4 = c1.add(20);
       System.out.println("c1 + 20min: " + c4);
       
       Clock c5 = c1.add(c3);
       System.out.println("c1 + c3: " + c5);
    }
 }
 
     

