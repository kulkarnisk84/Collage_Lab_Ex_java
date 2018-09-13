import java.util.Scanner;
class Numereter
{
public static void  main(String [] args)
{
	Scanner a = new Scanner(System.in);
	System.out.print("First number:");
	int F =a.nextInt();
	
	Scanner b=new Scanner(System.in);
	System.out.print("Scond Nummber:");
	int S= b.nextInt();
	
	int A=F+S;
	int B=F-S;
	int C=F*S;
	int D=F/S;
	int G=F%S;
	
	System.out.print(A+"\n"+B+"\n"+C+"\n"+D+"\n"+G);
}

}