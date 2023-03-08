//Checking whether the ARRAY is Subset of another array by using nested loop 

public class Subsetbyjavatpoint1 {
static boolean Subset(int arr1[], int arr2[], int m,int n)
{
       int i,j = 0;
       for (i = 0; i < n; i++) 
       {
         for (j = 0; j < m; j++)
         {
              if (arr2[i] == arr1[j])
              {
	             break;
              }
         }
              if (j == m) 
              {
                  return false;
              }
       }
       return true;
}

	public static void main(String[] args) 
	{
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (Subset(arr1, arr2, m, n))
		{
			System.out.print("arr2[] is subset of arr1[] ");
		}
		else
		{
			System.out.print("arr2[] is not a subset of arr1[]");
		}
		}
}
