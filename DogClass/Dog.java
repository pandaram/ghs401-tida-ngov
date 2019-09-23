
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private String name;
    private String breed;
    private int weight;

    public Dog()
    {
        // initialise instance variables
        name = null;
        breed = null;
        weight = 0;
    }

    public Dog(String n, String b, int w)
    {
        // initialise instance variables
        this.name = n;
        this.breed = b;
        this.weight = w;
    }

    
    //return type is an int
    public int getWeight()
    {
        return this.weight;
    }
    public String toString()
    {
        // put your code here
        return "Name: " + this.name + " " + "Breed: " + this.breed + " " + "Weight: " + this.weight;
    }
}
