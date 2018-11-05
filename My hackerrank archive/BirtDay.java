import java.util.Scanner;
class BirtDay
{
    public static void main(String...s)
        
    {
        int p=0,count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
         int d = sc.nextInt();
        int m  =sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            
                for(int k=i;k<m;k++)
                { 
                    p = a[k]+p;
                }
                if(p==d)
                    count++;
                
                
            
          }
            System.out.println(count);
    }
}