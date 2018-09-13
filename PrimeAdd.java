public class PrimeAdd
{
	public static void main(String[] agrs)
	{
		int i,num,count,sum=0;
		System.out.print("This is 1 to 100 number");
		for(num=1;num<=100;num++)
		{
			count=0;
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
					
				}
				
			}
			if(count==0||count==1)
			{
				System.out.print(num+" ");// This is print all 1 to 100 prime number
				sum=sum+num;
				
			}
			
		}
		System.out.print("Add of prime number= "+sum);
		
	}


}