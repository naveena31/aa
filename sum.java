import java.io.*;
import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int n,r, sum=0;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
			System.out.println(sum);
	}
}
		
	
