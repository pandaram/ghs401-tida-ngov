import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fishy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fishy extends Actor
{
    /**
     * Act - do whatever the Fishy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //move the object one pixel
        move(5);

        //checks if the object is at the edge, and if yes, then turn 
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(359));
        }
        if(isTouching(Fishy.class)){
            getWorld().addObject(new Fishy(), 100, 100););
        }    
    }
}



