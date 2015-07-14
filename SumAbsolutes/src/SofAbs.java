import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SofAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] l=s.split(" ");
		int n=Integer.parseInt(l[0]);
		int q=Integer.parseInt(l[1]);		
		String r=br.readLine();	
		int[] nums=new int[n];
		String[] snums=r.split(" ");
		for(int i=0;i<n;++i)
		{
			int temp=Integer.parseInt(snums[i]);
			nums[i]=temp;
		}
		ArrayList<ArrayList<Integer>> queries=new ArrayList<ArrayList<Integer>>();
		for(int j=0;j<q;++j)
		{
			String temp_q=br.readLine();
			String[] u=temp_q.split(" ");
			int left=Integer.parseInt(u[0]);
			int right=Integer.parseInt(u[1]);
			ArrayList<Integer> each_q=new ArrayList<Integer>();
			each_q.add(left);
			each_q.add(right);
			queries.add(each_q);
			
		}
		for(int k=0;k<queries.size();++k)
		{
			int sum=0;
			int l_n=queries.get(k).get(0);
			int r_n=queries.get(k).get(1);
			for(int m=l_n-1;m<=r_n-1;++m)
			{
				sum=Math.abs(sum+nums[m]);
			}
			if(sum%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}	
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
