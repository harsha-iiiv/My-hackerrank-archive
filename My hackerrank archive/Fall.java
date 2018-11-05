import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 class Bst {
     public static boolean VPre(int[] nodes, int l){
        return VPreH(nodes, 0, l-1);
    }
    
    
    
    public static boolean VPreH(int[] nodes, int beg, int end){
        if(end<=beg)   
            return true;
        int root = nodes[beg];  
        int i = beg+1;
        while(i<=end && nodes[i]<root)
            i++;
        int right = i;  
        while(i<=end && nodes[i]>root)
            i++;
        if(i!=end+1)
            return false;
         return VPreH(nodes, beg+1, right-1) &&
            VPreH(nodes, right, end);
    }
  
 }

  

public class Fall {
    public static void main(String args[] ) throws Exception {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          for(int j=0;j<t;j++)
          {
        int l = sc.nextInt();
        int[] nodes = new int[l];
         for (int i=0;i<l;i++ ) {
             nodes[i] = sc.nextInt();
         }
       if(Bst.VPre(nodes,l))
                System.out.println("YES");
            else
                System.out.println("NO");     
                }  
      
    }
}