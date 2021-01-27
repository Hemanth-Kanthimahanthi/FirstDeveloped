class Fullpattern3
{
	public static void main(String []args)
	{
		int space=-1;
		int star=11;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				space++;
				star-=2;
			}
			else
			{
				space--;
				star+=2;
			}
			for(int x=1; x<=space; x++)
			{
				System.out.print(' ');
			}
			for(int y=1; y<=star; y++)
			{
				System.out.print('*');
			}
				System.out.println(' ');
		}
	}
}