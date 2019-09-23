
/**
 * Write a description of class DogDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogDriver
{
    public static void main(){ 
        Dog dog1 = new Dog("Sri", "Adorable Genius", 14);
        Dog dog2 = new Dog("Jess", "Dorky Genius", 17);
        Dog dog3 = new Dog();

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        
        System.out.println(dog1.getWeight());
    }
}
