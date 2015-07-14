import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class SandArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int t=Integer.parseInt(st);
		ArrayList<Long> nel_list=new ArrayList<Long>();
		ArrayList<ArrayList<Long>> nums=new ArrayList<ArrayList<Long>>();
		while(t>0)
		{
			t--;
			long ns=Long.parseLong(br.readLine());
			nel_list.add(ns);
			String els=br.readLine();
			String[] sarr=els.split(" ");
			ArrayList<Long> tlist=new ArrayList<Long>();
			for(int s=0;s<ns;s++)
			{
				long tn=Long.parseLong(sarr[s]);
				tlist.add(tn);
			}
			nums.add(tlist);
		}
		
		
		for(long nsize : nel_list)
		{
			long sumleft=0;
			long sumright=0;
			long k=0;
			for(int j=0;j<nsize;j++)
			{
				k=j+1;
				sumleft+=nums.get(n).get(j);
				sumright=0;
				if(k>nums.get(n).size())
				{
					System.out.println("NO");
					break;
				}				
				for(int l=j+2;l<nums.get(n).size();l++)
				{
					sumright+=nums.get(n).get(l);
				}
				if(sumleft==sumright)
				{
					System.out.println("YES");
					break;
				}
				
			}
			if(sumleft==sumright || k>nums.get(n).size())
			{				
				continue;
			}
			
			System.out.println("NO");
		}
			
		}
		
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
