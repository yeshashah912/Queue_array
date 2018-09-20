import java.util.Scanner;


public class Find {
	
	
	public int[] Array= {2,3,5,16,37,50,73,75,126};
	boolean ArrayFind(int Array[], int n, int s)
	{
		for(int i=0;i<n;i++)
		{
			if(s==Array[i])
			{
				return true;
			}
		 return false;
		}
		return false;	
			
	}
	public static void main(String args[])
	{
		System.out.println("Enter an element:");
		Scanner S=new Scanner(System.in);	
		int s= S.nextInt();
	//Find A=new Find();
	//A.ArrayFind(int Array[],n,s);
		
	}
}
