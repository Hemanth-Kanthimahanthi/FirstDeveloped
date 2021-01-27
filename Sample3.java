class Sample3 
{
public void test(int z)
	{
		System.out.println(z);
	}
	public static void shoot(String a)
	{
		System.out.println(a);
	}
	public static void create(char x,boolean y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample3 g1=new Sample3();
		g1.test(8561);
		shoot("Shoot bullets");
		create('S',false);
		System.out.println("Main ends");
	}
	
}