package PracticePrograms;

public class MaxMinArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,9,11,23,45,72};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		// TODO Auto-generated method stub
System.out.println("maximum is "+max+"& minimum is "+min);
	}

}
