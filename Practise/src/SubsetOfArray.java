import java.util.*;
import java .lang.*;
import java.io.*;
public class SubsetOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the elements for an array");
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int  l1=scan.nextInt();
			int l2=scan.nextInt();
			HashSet<Integer>s=new HashSet<>();
			for(int j=0;j<l1;j++)
			{
				int m=scan.nextInt();
				s.add(m);
			}
			int gc=0;
			for(int j=0;j<l2;j++)
			{
				int m=scan.nextInt();
				if(s.contains(m))
				{
					gc=gc+1;
				}
			}
			if(gc==l2)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}

}
