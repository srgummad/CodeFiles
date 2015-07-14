import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String tempstr=str.toLowerCase();
		char[] charstr=tempstr.toCharArray();
		HashMap<Character,Integer> chars=new HashMap<Character,Integer>();
		boolean flag=false;
		for(int i=0;i<tempstr.length();i++)
		{
			if(charstr[i]==' ')
				continue;
			if(!chars.containsKey(charstr[i]))
			{
				chars.put(charstr[i], 1);
			}
			if(chars.size()==26)
			{
				flag=true;
				break;
			}
				
		}
		if(flag)
			System.out.println("pangram");
		else 
			System.out.println("not a pangram");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
