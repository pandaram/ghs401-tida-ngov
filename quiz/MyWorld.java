import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //addObject(new wombat(), 20, 20);
        for(int i=0; i<29; i++){
            addObject(new wombat(), 20, 20);
        }   
    }
}
