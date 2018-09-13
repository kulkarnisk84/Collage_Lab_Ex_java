import java.util.Scanner;
class Basic 
{

	public static void main(String [] args)
	{
		Scanner reader =new Scanner(System.in);
		System.out.print("First number :");
		int n=reader.nextInt();
		
		
		Scanner reader1 =new Scanner(System.in);
		System.out.print("Scoend number :");
		
		
		
		int m=reader.nextInt();
		int p;
		
		p=n*m;
		
		System.out.print("Ans:"+p);
		
		reader.close();
		
		
	}

}