import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panda extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;

    public Panda() 
    {
        this.name = null;
        this.speed = 0;
        this.turnAmount = 0;
    }    

    public Panda(String n, int s){
        this.name = n;
        this.speed = s;
        this.turnAmount = Greenfoot.getRandomNumber(91);

    }

    public void act(){
        move(this.speed);
        if(isAtEdge()){
            turn(this.turnAmount);
            this.speed += 1;
        }
        if(isTouching(Actor.class)){
            turn(this.turnAmount);
            this.speed++;
        }
        this.speed = this.speed;
        getWorld().showText(this.toString(), getWorld().getWidth()/2+100, getWorld().getHeight()/2+100);
    }

    public String toString(){
        return "Name: " +this.name + "\nSpeed: " + this.speed + "\nTurn amount: " + this.turnAmount + "\nX: " + getX() + "\nY: " + getY();
    }
}
