

/**
 * Write a description of class ArraysAndStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraysAndStuff
{
    public static void main(){
        
        
        
        //random integer between 90 and 100 inclusive
        
        int num;
        
        for (int i = 0; i < 30; i++){
            num = (int)(Math.random()*11 + 90);
            System.out.println(num);
            System.out.println(num%2);
            
        }
        
        
        /*
        double num = Math.random();
        
        System.out.println(num);
        
        
        for (int i=0; i< 30; i++){
            System.out.println(Math.random());
            
        }
 
        int[] myArray = new int[8];
        
        //System.out.println(myArray.length);
        
        
        for(int i=0; i < myArray.length; i++){
            myArray[i] = i*15;
        
        }
        
        
          
        for(int i=0; i < myArray.length; i++){
            System.out.println("The value is: " + myArray[i]);

            
        }
        */
        
    }
}
