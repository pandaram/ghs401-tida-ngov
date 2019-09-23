
public class Ghost
{
   //instance variables for the class ghost
   private String color;
   private int speed;
   private int level;
   
   
   //zero-arguement constructor, basically makes a default code
   public Ghost(){
       color = null;
       speed = 0;
       level = 0;
       //System.out.println("A default ghost was created.");

    }
    
   //2 arguement constructor can set the instance variables to anything desired
   public Ghost(String c, int s, int l){
       this.color = c;
       this.speed = s;
       this.level = l;
       //System.out.println("A unique ghost was created.");
    }
   
   public void bumpLevel(){
       this.level++;
    }
    
   public void bumpSpeed(){
       this.speed ++;
       
    }
     
   public void bumpSpeed(int bump){
       this.speed += bump;
       
    }
   
   public void doubleColor(){
       this.color += this.color;
    }
   
    //public means other classes have access to this method
    //String is the return type; it gives back a string
    //toString is the name of the method
   public String toString(){
       return "Color: " + this.color + " " + "Speed: " + this.speed + " " + "Level: " + this.level;
    }
   
   
}

