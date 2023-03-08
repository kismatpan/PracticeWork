//FINDING DUPLICATES BY @ SET INTERFACE METHOD...
import java.util.*;
public class DuplicateArray2 {
	public static void main(String[] args) {
		int a[]= {4,5,7,4,8,6,1,2,3,5};
		System.out.println("DUPLICATES ARE FOLOWS TYPE ");
		Set<Integer> s = new HashSet<>();
		for(int elem:a)
		{
			if(s.add(elem)==false)
			{
				System.out.print(elem +" ");
			}
		}
	}
}
