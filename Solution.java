import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        if(s.length()>2)
        for(int i=0;i<3;i++)
        {
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(1));
        }
        else
        {
            for(int i=0;i<3;i++)
            {
                System.out.print(s);
            }
        }
       
    }
}
