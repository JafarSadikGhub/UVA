#include<stdio.h>
#include <math.h>

int main()
{

    int i,j;
    int a,b;
    int count=0;
    int inputLine;


for(inputLine = 0; inputLine<201; inputLine++)
{
    count = 0;
    scanf("%d%d",&a,&b);

    if(a==0 && b==0)
    {

        break;
    }
    else
    {


    for( i = a; i<=b; i++)
     {

        int n = sqrt(i);
        if(n*n==i)count++;

      }

    }

               printf("%d\n",count);
    }

         return (0);
}

