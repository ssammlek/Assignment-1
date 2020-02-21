public class Calc
	implements ICalculator{
	public int add(int x,int y)
	{
		int ans;
		ans= x+y;
		return ans;
	}
	public float divide(int x,int y)
	{
		try {
			float ans;
			ans=x/y;
			return ans;
		} catch(Exception e)
		{
			System.out.println("Error");
			return -1;
		}
	}
}