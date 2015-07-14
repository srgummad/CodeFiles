import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class WeirdSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String p=br.readLine();
		int t=Integer.parseInt(p);
		String s=br.readLine();
		String[] l=s.split(" ");
		long n=Long.parseLong(l[0]);
		long m=Long.parseLong(l[1]);		
		System.out.println(n+" "+m);
		int q=1;
		ArrayList<List<Integer>> nlist=new ArrayList<List<Integer>>();
		while(n/1!=0)
		{
			List<Integer> tlist=new ArrayList<Integer>();			
			long r= n%10;
			for(int i=1;i<=r;i++)
			{
				tlist.add(i);
			}
			n=n/10;
			nlist.add(tlist);
		}
		System.out.println("sadsadad");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
