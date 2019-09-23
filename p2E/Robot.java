import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private int speed;
    private double batteryLevel;
    private String name;
    private int calls;
    
    
    public Robot() 
    {
        this.speed = 0;
        this.batteryLevel = 0;
        this.name = null;
       
    }    
    
    public Robot(int s, double b, String n){
        this.speed = s;
        this.batteryLevel = b;
        this.name = n;
        
    }
    
    public void act(){
        
        if(batteryLevel != 0){
            move(speed);
            calls ++;
        }
        if(batteryLevel == 0){
            return;
        }
        if(calls%3 == 0){
            batteryLevel-=1;
        }
        
        if(isAtEdge()){
            move(-1);
            turn(90);
        }
        getWorld().showText(this.toString(), getWorld().getWidth()/2+100, getWorld().getHeight()/2+100);
    }
    
    public String toString(){
        return "Speed: " + this.speed + " Battery Level: " + this.batteryLevel + " Name: " + this.name;
    }
}
