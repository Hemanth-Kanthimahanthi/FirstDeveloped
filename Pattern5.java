class Pattern5
{
	public static void main(String []args)
	{
	int s=-1;
		for(int i=3;i>0;i--)
		{s+=2;
			for(int j=1;j<=s;j++)
			{
				if(s<i)
				{
					System.out.print('@');
				}
				else
				{
					System.out.print('*');
				}
			}
					System.out.println();
		}
	}
}