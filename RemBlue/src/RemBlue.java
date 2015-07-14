import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class RemBlue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String res="";
        HashMap<Character,Integer> blues=new HashMap<Character,Integer>();
        ArrayList<Integer> indexes=new ArrayList<Integer>();
        for(int i=0;i<str.length();i++)
        {        	
        	if(str.charAt(i)=='B' || str.charAt(i)=='L' || str.charAt(i)=='U' || str.charAt(i)=='E')        		
        	{
        		if(blues.size()==0 && i!=0)
        		{
        			if(str.charAt(i-1)!=' ')
        				continue;
        		}
        		if(!blues.containsKey(str.charAt(i)))
        		{
        			blues.put(str.charAt(i), 1); 
        			if(i+1==str.length() && blues.size()==4)
        				indexes.add(i-3);
        			
        		}
        		else
        		{
        			blues.clear();
        			continue;
        		}
        		
        	}
        	else if(blues.size()==4 && str.charAt(i)==' ')
        	{
        		int t=i-4;
        		indexes.add(t);
        		blues.clear();
        	}
        	else
        		blues.clear();
        }
        char[] tempstring=str.toCharArray();
        for(int k=0;k<indexes.size();k++)
        {        	
        	tempstring[indexes.get(k)]='X';
        	tempstring[indexes.get(k)+1]='X';
        	tempstring[indexes.get(k)+2]='X';
        	tempstring[indexes.get(k)+3]='X';
        }
        String restring=String.valueOf(tempstring);
        System.out.println(restring);
        
        
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        
        
        
	}

}
