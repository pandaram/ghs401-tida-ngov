import javax.swing.JOptionPane;
/**
 * Write a description of class WhileLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhileLoops
{
    public static void main(){
        /*
        double hoursOfSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep last night?"));

        while(hoursOfSleep < 0){
        System.out.println("That isn't right! Please try again.");
        hoursOfSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep last night?"));
        }
        System.out.println("You said " + hoursOfSleep + "hours."); 
         */

        int amount = Integer.parseInt(JOptionPane.showInputDialog("How many numbers would you like in your array?"));
        while(amount>10000 || amount<10){
            amount = Integer.parseInt(JOptionPane.showInputDialog("How many numbers would you like in your array?"));
        }
        int newNum = 0;
        int[] numbers = new int[amount];        
        for (int i=0; i<numbers.length; i++){
            newNum = (int)(Math.random()*7 + 14);
            numbers[i] = newNum;
            System.out.print(numbers[i] + " ");
        }
            
        int greatest = 0;
        int least = 100;
        for (int i=0; i<numbers.length; i++){
            if(numbers[i] < least){
                least = numbers[i];
            }
            else if(numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }
        

        System.out.println("Greatest: " + greatest);
        System.out.println("Least: " + least);
    }

}

