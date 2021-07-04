package Prime;
import java.util.*;
public class ArrayTravesala {
	private int[]a;
	private int s=0;
   private Scanner in=new Scanner(System.in);	
	public void arrayTraversal()
	{
		int getno;
		int i;
		a=new int[5];
		
		for(i=0;i<5;i++)
		{
			System.out.printf("\nEnter Value");
			a[i]=in.nextInt();
		}
		
		System.out.printf("\nWhat Should Number be Searched?::");
		getno=in.nextInt();
		
		
		for(i=0;i<5;i++)
		{
			
			if(a[i]==getno)
			{
				s++;
				System.out.printf("\nNumber has been found .Position :%d",i+1);
				break;
			}
		}
		
		if(s==0)
		{
			System.out.printf("\n The number isn't in the list");
		}
		
		
	}
	
}
