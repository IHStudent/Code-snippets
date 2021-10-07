import java.util.Scanner;
import java.util.ArrayList;

public class MaxMin
{
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> c = new ArrayList<Integer>();
        while(true){
            System.out.println("Enter a number or 0 to quit:");
            int n = s.nextInt();
            if(n == 0){
                break;
            }
            c.add(n);
            int[] h = numFind(c);
            System.out.println("Results so far: ");
            System.out.println("Largest number: " + h[0]);
            System.out.println("Smallest number: " + h[1]);
            
        }
    }
    
    static int[] numFind(ArrayList<Integer> c){
        int g = Integer.MIN_VALUE;
        int m = Integer.MAX_VALUE; 
        for(Integer i : c){
            if(i > g) g = i;
        }
        for(Integer z : c){
            if(z < m) m = z;
        }
        int [] h = {g, m};
        return h;
    }
    
}