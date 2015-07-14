import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		ArrayList<Integer> flags=new ArrayList<Integer>();
		while(t>0)
		{
			String str=br.readLine();
			char[] chars=str.toCharArray();
			boolean flag=true;
			int last=str.length()-1;
			for(int i=0;i<str.length();i++)
			{
				if(i+1<=str.length() && last-i-1>=0)
				{
					/*int t1=chars[i+1]-chars[i];
					int t2=chars[last-i]-chars[last-i-1];*/
					if(Math.abs(chars[i+1]-chars[i])!=Math.abs(chars[last-i]-chars[last-i-1]))
					{
						flag=false;				
						break;
					}
				}
			}
			if(flag)
				flags.add(1);
			else
				flags.add(0);
			t--;
		}
		for(int j=0;j<flags.size();j++)
		{
			if(flags.get(j)==0)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
