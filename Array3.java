import java.util.*;
class Array3
{
        public static void main(String arg[])
       {
                 
                int[]   a= new int[100];    
                int i,n,l=0;
	System.out.println("Enter n");
                  Scanner t=new Scanner(System.in);
                  n=t.nextInt();
                  System.out.println("Enter a value");
	for(i=0;i<n;i++)
	{
	  a[i]=t.nextInt();
	}
                
                for(i=0;i<n;i++)
                {
                   if(a[i]>l)
	   {
	      l=a[i];
	   }	
	}
	System.out.println("largest no in array is:"+l);
          }
}