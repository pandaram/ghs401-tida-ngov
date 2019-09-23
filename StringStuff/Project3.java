import javax.swing.JOptionPane;
/**
 * Write a description of class Project3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project3
{
    public static void main(){

        String school = JOptionPane.showInputDialog("Please input your school: ");

        if(school.equals("Granada")){

            String mascot = JOptionPane.showInputDialog("Please input your mascot: ");

            if(mascot.equals("Matadors")){
                String[] characters = {"Mulan", "Waldo", "Totoro", null};
                for (int i=0; i<characters.length; i++){

                    if(characters[i]!=(null)){

                        if(characters[i].equals("Waldo")){
                            System.out.println("You found Waldo! Congrats!" + " " + (i+1));
                        }
                        else{
                            System.out.println("Waldo isn't here, keep looking." + " "  + "In this spot is " + characters[i] + " " + (i+1));
                        }
                    }
                    else{
                        System.out.println("Spot " + (i+1) + "  is empty(null).");
                        System.out.println("Waldo isn't here, keep looking." + " " + (i+1));
                    }
                }

                String favCharacter = JOptionPane.showInputDialog("Please input your favorite movie character: ");
                String favCharac = "Totoro";
                if(favCharacter.equals(favCharac)){
                    System.out.println("We have the same taste in movies!");
                }
                else{
                    System.out.println("We don't have the same taste in movies.");
                }
            }
        else{
            System.out.println("Your mascot is incorrect, please try again.");
        }
        }
        else{
            System.out.println("Your school is incorrect, please try again.");
        }
    
        
    }
    
    }



