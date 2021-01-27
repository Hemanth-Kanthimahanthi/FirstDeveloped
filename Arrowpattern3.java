class Arrowpattern3
{
	public static void main(String []args)
	{
		int space=5;
		int star=0;
		for(int i=1;i<=9;i++)
		{
			
			if(i<=5)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			for(int x=1;x<=space;x++)
			{
				System.out.print(' ');
			}
			for(int y=1;y<=star;y++)
			{
				System.out.print('*');
			}
			if(i<=3)
			{
				for(int a=1; a<=8; a++)
				{
					System.out.print(' ');
				}			
			}
			else if (i<=6)
			{
				for(int b=1; b<=8; b++)
				{
					System.out.print('*');	
				}
			}
			else
			{
				for(int c=1; c<=8; c++)
				{
					System.out.print(' ');
				}
			}
				System.out.println();
		}
	}
}