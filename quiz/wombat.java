import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wombat extends Actor
{
    private int speed;

    public wombat()
    {
        this.speed = 5;
    }

    public void act() 
    {
        move(this.speed);
        if(Greenfoot.isKeyDown("t")){
            turn(5);
        }

        if(Greenfoot.isKeyDown(" ")){
            this.speed ++;
        }
         
    }
}
