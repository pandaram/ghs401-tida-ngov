import javax.swing.JOptionPane;

public class InputOutput
{
   public static void main(){
       
       //String name = JOptionPane.showInputDialog("What is your name?");
       int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of a:")); //1
       int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of b:")); //6
       int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of c:")); //5
       
       int b2 = b*b; //36
       int ac = 4*a*c; //5

       System.out.println("b squared is: " + b2);
       System.out.println("4*a*c is: " + ac);
       int calc = b2 - ac; //31
       
       //int sqrt = Math.sqrt(calc);
       
       double ans1 = (((Math.sqrt(((b2)-ac)) - b)/(2*a)));
       double ans2 = (((-1*(Math.sqrt(((b2)-ac))) - b)/(2*a)));
       if (ac > b2){
           System.out.println("Sorry, your discriminant is negative and you broke the computer. Congrats!");
        }
       
       else{
       System.out.println(ans1);
       System.out.println(ans2);
       
    }
      
        
    }
}
