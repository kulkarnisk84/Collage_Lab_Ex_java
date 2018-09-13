public class Account
{
	int Ac_Num;
	String Name;
	float Amount;
	void Insets(int A,String N, float Amt)
	{
		Ac_Num = A;
		Name =N;
		Amount = Amt;		
	}
	void Deposit(float Amt)
	{
		Amount=Amount+Amt;
		System.out.print(Amt+"Deposit");
		
	}
	void Withdraw(float Amt)
	{
		if (Amount<Amt)
		{
			System.out.print("Error");
		}else{
			Amount=Amount-Amt;
			System.out.print(Amt+"Withdraw");
		}

		
	}
	void DisplayBalance()
	{
		System.out.print("Balance is:"+Amount);
	
	}
	void Display()
	{
		System.out.print(Ac_Num+" "+Name+" "+Amount);
	}
}

class AccountD
{
	public static void main( String[] args)
	{
		Account A1= new Account();
		A1.Insets(1236547456,"Shubham Kulkarni", 10000);
		A1.Withdraw(5000);
		A1.DisplayBalance();
	}
}