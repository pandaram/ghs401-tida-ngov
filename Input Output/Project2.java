import javax.swing.JOptionPane;
/**
 * Write a description of class Project2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project2
{
    public static void main(){
        int low = Integer.parseInt(JOptionPane.showInputDialog("Enter your low number: "));
        int high = Integer.parseInt(JOptionPane.showInputDialog("Enter your high number: "));

        int[] myArray = new int[8];

        int odd = 0;
        

        if (low < high){
            /* for (int i = 0; i < 30; i++){
            num = (int)(Math.random()*11 + 90);
            System.out.println(num);
            System.out.println(num%2);

            }*/

            int interval = (high - low + 1);
            for (int i=0; i< myArray.length; i++){
                int num = (int)((Math.random()*interval + low));
                myArray[i] = num;
                int mod = (num%2);
                System.out.println(i + ": " + myArray[i]);

                if (mod == 1){
                    System.out.println("Odd");
                    odd += 1;
                }

                else if (mod == 0){
                    System.out.println("Even");
                    
                }
            }
            System.out.println("Odd Values: " + odd);
            System.out.println("Even Values: " + (myArray.length - odd));
        }
        else {
            System.out.println("Please try again.");
        }
    }       
}
