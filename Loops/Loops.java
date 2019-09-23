
/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loops
{
    public static void main(){
        String[] firstNames = {"Sri", "Anvi", "Elizabeth", "Tida"};
        String[] lastNames = {"Saraf", "Gaur", "Paik", "Anchovy"};
        
        System.out.println("First name\t\tLastName");
        
        double rand1;
        double rand2;
        
        /*
        for(int i=0; i<10; i++){
            rand1 = Math.random()*(firstNames.length);
            rand2 =  Math.random()*(lastNames.length);
            
            System.out.println(firstNames[(int)(rand1)] + "\t\t" + lastNames[(int)(rand2)]);
        }
        */
        
        int a = (firstNames.length-1);
        
        while(a>=0){
            System.out.println(firstNames[a]);
            a--;
        }
        
    }
}
