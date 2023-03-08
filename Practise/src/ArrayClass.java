import java.util.*;
public class ArrayClass {

	public static void main(String[] args) 
	{
		String kismat[]= new String [5];
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<kismat.length;i++)
		{
			System.out.println("hiii,enter your  name " +i);
			kismat[i]=sc.next();
			
			System.out.println("hii ,enter your father name" +i);
			kismat[i]=sc.next();
			
			System.out.println("hii,enter your surname" +i);
			kismat[i]=sc.next();
			
			System.out.println("hii,enter your place of birth" +i);
			kismat[i]=sc.next();
			
			System.out.println("hii,enter your mothertongue" +i);
			kismat[i]=sc.next();
		}
			for(int i=0;i<kismat.length;i++)
			{
				System.out.println("your data  " +kismat[i]);
				break;
			}
			
			
		
		
		System.out.println();

	}

}
