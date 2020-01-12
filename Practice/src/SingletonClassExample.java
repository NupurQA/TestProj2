
public class SingletonClassExample {
	
	private static SingletonClassExample s;
	
	private  SingletonClassExample()
	{
	}
	
	public SingletonClassExample getInstance()
	{
		if(s==null)
		{
			s=new SingletonClassExample();
		}
		return s;
		
	}

}
