package com.bean;

import java.util.ArrayList;

public class Duplicate {
	
	public int findDuplicate(ArrayList<Integer> nums)
	{
		int highest=nums.size()-1;
		System.out.println(highest);
		int total=getTotal(nums);
		System.out.println(total);
		int actualCount= (highest * (highest + 1)/2);
		System.out.println(actualCount);
		int number=highest-(actualCount-total);		
		return number;
	}
	
	public int getTotal(ArrayList<Integer> nums)
	{
		int total=0;
		for(int i=0;i<nums.size();i++)
		{
			total=total+nums.get(i);
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> nums=new ArrayList<Integer>();
		for(int i=0;i<30;i++)
			nums.add(i);
		nums.add(22);
		Duplicate dup=new Duplicate();
		System.out.println("Duplicate number is : " + dup.findDuplicate(nums));
	}

}
