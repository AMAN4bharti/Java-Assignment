package ExceptionHandling;

class AIOBE 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		
		try
		{
			System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\"You cannot access the element which is greater the declared size!!!\"");
		}
	}
}
