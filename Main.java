import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        for (int i = input.length()-1; i>=0; i--) 
        {
            char ch = input.charAt(i);
            if (ch == ' ') 
            {
                System.out.print(" ");
            } 
            else 
            {
                System.out.print(ch);
            }
        }
        System.out.println();
        
        int f = 0;
        for(int i = input.length()-1; i>=0; i--)
        {
            char ch = input.charAt(i);
            if (ch == ' ')
            {
                int c = 0;
                for(int k=i+1; k<input.length()-f ;k++)
                {
                    System.out.print(input.charAt(k));
                    c++;
                }
                f += c+1;
                System.out.print(" ");
            }
            if (i == 0)
            {
                for(int k=i; k<input.length()-f ;k++)
                {
                    System.out.print(input.charAt(k));
                }
            }
        }
        System.out.println();
        
        int count = 0, flag = 0;
        for (int i=0;i <input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (ch == ' ') 
            {
                for(int k=i-1;k>=count;k--)
                {
                    System.out.print(input.charAt(k));
                    flag++;
                }
                System.out.print(" ");
                count = flag+1;
            } 
            if (i==input.length()-1)
            {
                for(int k=i;k>=count;k--)
                {
                    System.out.print(input.charAt(k));
                }
            }
        }
        
    }
}