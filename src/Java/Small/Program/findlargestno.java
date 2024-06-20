package Java.Small.Program;

public class findlargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,5,2,7,8};
		int largest = 0;
		
		int i=0;
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					largest=arr[i];
				}
			
		}
		System.out.println("Largest="+largest);
 
	}

}
