//Counting Duplicates by using HashSet Method 
import java.util.*;
public class DuplicateArrayElemSearching3 {

	public static void main(String[] args) {
		int a [] = {2,5,9,7,6,4,3,1,5,4,2};
		 System.out.println("THE DUPLICATES ELEMENTS IN ARRAY ARE ");
		 Set<Integer> s=new HashSet<>();
		 for(int elem:a)
		 {
			 if(s.add(elem)==false )
			 {
				 System.out.println(elem);
			 }
		 }
	}

}
