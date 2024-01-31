package PracticePrograms;

public class PalimdromeString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="mumm";
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!= str.charAt(j))
			{
				System.out.println("Not a palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
	}

}
