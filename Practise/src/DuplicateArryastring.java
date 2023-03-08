
import java.util.*;
public class DuplicateArryastring {

	public static void main(String[] args) {
		String [] a = {"kismat","milind","kismat"," panchbhai"};
		System.out.println("Dup are ");
		Set<String>s =new HashSet<>();
		boolean flag=false;
		for(String elem:a)
		{
			if (s.add(elem)==false)
			{
				System.out.println("duplicates are " + "" + elem);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println(" no duplicates");
		}
		

	}

}
