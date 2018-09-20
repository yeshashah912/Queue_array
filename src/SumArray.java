import java.util.*;


public class SumArray {
	public static int n;
	static int List[]= new int[20];
		public static int Sum(int Arry[],int n) //recursion method to print sum of n elements in the array
		{	
	    if(n==0) 							//base case
	    {
	    	//System.out.println(n);
	    	System.out.println("The sum:");
	    	return n;  
	    }
	    else{
	    
	    return Arry[n-1]+Sum(Arry,n-1);    
		
	    }
		
	}
	public static void main(String args[])
	{
				do{
				System.out.print("Enter the size of Array upto 20:"); //enter the size of the array which you like
				Scanner sc1=new Scanner(System.in); //scans the integer 
				n=sc1.nextInt();
				}while(n>20 || n<0);
				System.out.print("Enter Numbers:"); // enter the elements of the array
				Scanner sc=new Scanner(System.in); //scans all the elements
				for(int i=0;i<n;i++)
				{
					List[i]=sc.nextInt(); //stores all the elements 
				}
				//System.out.println(n);
				int arrytotal = Sum(List,n);		
				System.out.println(arrytotal); //method call and print 

	}
}
		

