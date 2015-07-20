package calc;
import java.util.*;

public class Runner 
{
    public static void main(String[] args) 
    {
        int a = 0;
        String operation = ""; //Should be "ADD", "SUB", "DIV" or "MUL"
        int b = 0;
        
        try(Scanner in = new Scanner(System.in))
        {
            a = in.nextInt();
            operation = in.next();
            b = in.nextInt();
        }      
        
        try
        {
            System.out.println(Operation.valueOf(operation.toUpperCase()).call(a, b));
        }
        catch(Exception e)
        {
            System.out.println("Error: no such operation.");
        }
    }  
}
