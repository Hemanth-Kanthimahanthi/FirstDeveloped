class Sample2 
{
	public static void start()
	{
		System.out.println("Start Listening songs");
	}
	public static void stop(int x,double y,boolean z)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		start();
		stop(45,8.6,true);
		System.out.println("Main ends");
	}
	
}
