import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

public class ExampleConflictedFile
{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Tell me two integers to multiply");
            try
            {
                String line = br.readLine();
                int space = line.indexOf(' ');
                int int1 = Integer.parseInt(line.substring(0, space));
                int int2 = Integer.parseInt(line.substring(space + 1, line.length()));
                System.out.println(multiply(int1, int2));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    /*
     * In this method we have a conflict between your code and what is
     * currently in master. Either version would correctly multiply those
     * numbers, but github doesn't know how to choose. You may need to fix
     * methods looking like this when coding on repositories that other people
     * contribute to.
     */
    public static int multiply(int int1, int int2){
        <<<<<<< HEAD
        return int1 * int2;
        =======
        int total = 0;
        for(int i = 0; i < int1; i++){
            total += int2;
        }
        return total;
        >>>>>>> LOCAL
    }
}
