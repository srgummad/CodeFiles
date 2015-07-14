import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		LinkedHashMap<Character,Integer> lmap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(lmap.containsKey(s.charAt(i)))
			{
				int t=lmap.get(s.charAt(i));
				t++;
				lmap.put(s.charAt(i), t);
			}
			else
			{
				lmap.put(s.charAt(i), 1);
			}
		}	
		
		Iterator<Integer> sitr=lmap.values().iterator();		
		int count=0,temp=0;
		Map<Integer,Integer> cmap=new LinkedHashMap<Integer,Integer>();			
		while(sitr.hasNext())
		{
			temp=sitr.next();
			if(cmap.containsKey(temp))
			{
				int x=cmap.get(temp);
				x++;
				cmap.put(temp, x);				
			}
			else
			{
				cmap.put(temp, 1);
			}
					
		}
		if(cmap.size()>2)
			System.out.println("NO");
		else
		{
			if(cmap.size()==2)
			{
				Iterator<Integer> citr=cmap.values().iterator();
				ArrayList<Integer> clist=new ArrayList<Integer>();
				while(citr.hasNext())
				{
					clist.add(citr.next());
				}
				int t1=clist.get(0);
				int t2=clist.get(1);
				if(t1==t2)
					System.out.println("NO");
				else if(t1==1 ||t2==1)
					System.out.println("YES");
				else
					System.out.println("NO");
				
			}
			if(cmap.size()==1)
				System.out.println("YES");
		}
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
