import java.io.IOException;
import java.util.Scanner;
class Main 
{
 
 
    public static void main(String[] args) throws IOException {
 
 
    Scanner input = new Scanner(System.in);
 while(input.hasNextInt())
 {
 
  int i = input.nextInt();
   int j = input.nextInt();
 
    int n;
    int p;
    int length = Math.max(i,j)-Math.min(i,j)+1;
    int[] arra = new int[length];
     int sum=0;
     int max=0;
 
 
    for(n=Math.min(i,j);n<=Math.max(i,j);n++)
    {
        arra[n-Math.min(i,j)] = n;
 
    }
 
    for(p=0;p<length;p++)
    { 
        sum = 1;
        while(arra[p]!=1)
        {
            if(arra[p]%2!=0)
            {
 
                arra[p] =3*arra[p] + 1;
                 sum++;
 
            }
            else
 
            {   
 
                arra[p]= arra[p]/2;
              sum++;
 
            }
 
        }
 
 
 
       max=(max>sum)?max:sum;
    }
        System.out.println(i +" " + j + " " + max);
 
}
}
}
