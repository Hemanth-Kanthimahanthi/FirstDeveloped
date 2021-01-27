class Arrowpattern4
{
	public static void main(String []args)
	{
		int space=5;
		int star1=0;
		int star2=0;
		for(int i=1;i<=9;i++)
		{
			
			if(i<=5)
			{
				space--;
				star1++;
			}
			else
			{
				space++;
				star1--;
			}
			for(int x=1;x<=space;x++)
			{
				System.out.print(' ');
			}
			for(int y=1;y<=star1;y++)
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
			if(i<=5)
			{
				star2++;
			}
			else
			{
				star2--;
			}
				for(int k=1;k<=star2;k++)
				{
					System.out.print('*');
				}
				System.out.println();
		}
	}
}