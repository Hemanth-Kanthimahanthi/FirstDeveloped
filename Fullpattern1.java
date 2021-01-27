class Fullpattern1
{
	public static void main(String []args)
	{
		int star=0;
		for(int i=1;i<=7;i++)
		{
			if (i<=4)
			{
				star++;
			}
			else
			{
				star--;
			}
			for(int x=1;x<=star;x++)
			{
				System.out.print( '*');
			}
				System.out.println(' ');
		}
	}
}