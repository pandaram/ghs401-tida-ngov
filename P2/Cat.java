import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Cat extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    private int collisionCount;
    
    public Cat() 
    {
        this.name = null;
        this.speed = 0;
        this.turnAmount = 0;
        this.collisionCount = 0;
    }    
    
    public Cat(String n, int s){
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
            this.collisionCount++;
            this.speed++;
            System.out.println(this.collisionCount);
        }
        this.speed = this.speed;
        getWorld().showText(this.toString(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        
    }
    
    public String toString(){
        return "Name: " + this.name + "\nCollision count: " + collisionCount + "\nX: " + getX() + "\nY: " + getY();
    }    
}
