class Fullpattern2
{
	public static void main(String []args)
	{
		int star=6;
		for(int i=1;i<=9;i++)
		{
			if (i<=5)
			{
				star--;
			}
			else
			{
				star++;
			}
			for(int x=1;x<=star;x++)
			{
				System.out.print('*');
			}
				System.out.println(' ');
		}
	}
}