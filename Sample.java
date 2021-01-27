class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample o1=new Sample();
		o1.climb();
		o1.run();
		System.out.println("Main ends");
	}
	public void climb()
	{
		System.out.println("Climb a tower");
	}
	public void run()
	{
		System.out.println("Run towards North");
	}

}
