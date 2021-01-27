class Sample1
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		dive();
		Sample1 obj=new Sample1();
		obj.land();
		System.out.println("Main ends");
	}
	public static void dive()
	{
		System.out.println("Dive from Aeroplane");
	}
	public void land()
	{
		System.out.println("Land on ground which has grass");
	}
}
