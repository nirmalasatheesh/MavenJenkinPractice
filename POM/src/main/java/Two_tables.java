
public class Two_tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1;i<=20;i++)
		{
			if (i==10)
			{
			System.out.print("The i Value is Equal to 10:"+"");
			}
		else 
			if(i<10)
			{
			System.out.print("The i Value is less than 10:"+"");
			
			}
		else
		    {
			System.out.print("The i Value is greater than 10:"+ "");
			
		}
			
            int b = a*i;
			System.out.println(a+ "X"+ i + "=" + b);
		}
      }
	}


