// FINDING DUPLICATES BY BRUTE FORCE METHOD....
public class DuplicatesArray {

	public static void main(String[] args) {
		
		 int []a = {4,5,6,7,2,8,8,9,4,};
		 for(int i=0;i<a.length-1;i++)
		 {
			 for(int j=i+1; j<a.length; j++)
			 {
				 if(a[i]==a[j] && i!=j)
				 {
					 System.out.print(" duplicates are "+a[j] + " ");
				 }
				 
			 }
		 }

	}

}
