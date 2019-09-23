
/**
 * Write a description of class PandaDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PandaDriver
{
    public static void main(){
        Panda panda1 = new Panda("China", 120.0);
        
        double currentWeight = panda1.getWeight();
        
        currentWeight += 1000.0;
        
        panda1.setWeight(currentWeight);
        
        System.out.println(panda1.getWeight());
        
        //data type  name = new DataType
        Panda[] zoo = new Panda[3];
        
        zoo[0] = new Panda("USA", 314.1);
        
        zoo[1] = new Panda("Japan", 123.9);
        
        zoo[2] = new Panda("China", 12.3);
        for(int i=0; i<zoo.length; i++){
            System.out.println(zoo[i]);
            
           
        }
    }
    
}
