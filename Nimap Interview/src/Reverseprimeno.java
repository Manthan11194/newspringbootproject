
public class Reverseprimeno {
	
	public static boolean prime(int num) {
		
		
		if(num<=1)
		{
			return false;
		}
		else
		{
			for (int i=2;i<num;i++) 
			{
				if (num%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}
	

	public static void main(String[] args) {
		
		for(int i=100;i>0;i--)
		{
			
			if(prime(i))
			{
				System.out.println(i+" ");
			}
		}
	}

}
