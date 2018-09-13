public class Palind
{
	public static void main(String[] arg)
	{
		int r,sum=0,temp;
		int n=453 
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.print("Palindrone number");
			else
			System.out.print("not palindrome number");
		
		
	}

}