import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class ContestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l=br.readLine();
        String[] fl=l.split(" ");
		long n=Long.parseLong(fl[0]);
		long p=Long.parseLong(fl[1]);
        long x=Long.parseLong(fl[2]);			
		ArrayList<Long> r_list=new ArrayList<Long>();			
		String pr=br.readLine();
		String[] sp=pr.split(" ");		
		for(int i=0;i<n;i++)
		{
			long temp=Integer.parseInt(sp[i]);
			r_list.add(temp);
		}		
		ArrayList<Long> ratings=new ArrayList<Long>();
		long max=0;
		int count=0;
		for(int r=0;r<r_list.size();r++)
		{
			long rating=r_list.get(r)*p;
			p=p-x;
			if(p<=1)
				p=1;
			ratings.add(rating);
			if(rating>max)
				max=rating;
		}	
		ArrayList<Integer> hire=new ArrayList<Integer>();
		
		for(int j=0;j<ratings.size();j++)
		{
			if(ratings.get(j)==max)
			{
				hire.add(j+1);
				
			}
		}
		System.out.println(hire.get(hire.size()-1));
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
