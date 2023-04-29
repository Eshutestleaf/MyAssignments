package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
	int n=20,c;
		for(int i=1; i<=n; i++)
{
			
			c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("The number is prime" +i);
				
			}
				else
				{
				System.out.println("The number is not prime" +i);
			}
			
		}
	}

}
