
/**
 * Write a description of class Project4SquareRange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project4SquareRange
{
    public static void main(){
        int num;
        for(int i=1; i<11; i++){
            int square = (i*i);
            int diff = (square - i);

            num = (int)((Math.random()*(diff+1)) + i);


            if(square==num){
                System.out.println(i + "\t\t" + square + "\t\t" + num + "\t\t" + "The random value is equal to the square of the index.");
            }

            else if(i==num){
                System.out.println(i + "\t\t" + square + "\t\t" + num + "\t\t" + "The random value is equal to the index.");
            }

            else{
                System.out.println(i + "\t\t" + square + "\t\t" + num);
            }

        }
        
        String[] movies = {"frozen", "mulan", "shrek 2"};
        String[] songs = {"let it go", "i'll make a man out of you", "allstar"};
        for(int e=0; e<(movies.length); e++){
            System.out.print(movies[e] + "\n");
        }
        System.out.println(" ");
        System.out.println(" ");

        for(int p=0; p<(songs.length); p++){
            System.out.print(songs[p]);
            if(p<(songs.length-1)){
                System.out.print(", ");
            }
            
        }
    }
}
