/*


			Static and Non static methods


*/









class prgm1
{
	static int i;
	double j;
	static String s;
	boolean d;
	char ch;
	public static void create()
	{
		System.out.println(i);
		System.out.println(s);
	}
	public void talk()
	{
		System.out.println(ch);
		System.out.println(j);
		System.out.println(d);
		
	}
	public static void main(String []args)
	{
		create();
		prgm1 P=new prgm1();
		P.talk();
	}
}