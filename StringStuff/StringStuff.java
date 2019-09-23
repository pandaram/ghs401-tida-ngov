import javax.swing.JOptionPane;
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringStuff
{
   public static void main(){
       
       String[] classmates = {"Tida","Elizabeth", "Anvi", "Sri", null};
    /*   
       for (int i=0; i<classmates.length; i++){
           
           if(classmates[i]!= null){
            
           System.out.println(classmates[i].length());
           
        }
    }
       /*
       String name = new String("greg");
       String name2 = JOptionPane.showInputDialog("Name: ");
       
       int a = 10;
       int b = 10;
       
       if (name.equals(name2)){
           System.out.println("They are the same.");
        }
       else{
           System.out.println("They are NOT the same.");
        }
        */
       
    int a = 5;
    int b = 2;
    double c = (double)a/b;
    System.out.println(c);
    }
}
