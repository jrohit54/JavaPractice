package h.practice;

public class MaximumSubArray {

	
	
	public static void main(String[] args) {
		int arry[]={4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
	    int max_sum=arry[0];int cur_max=0;int start=0,end=0,s=0;
	    
		for (int i=0;i<arry.length;i++)
		{
			
			cur_max=cur_max+arry[i];
			
			if(max_sum<cur_max)
			{
				max_sum=cur_max;
				start=s;
				end=i;
			}
			
			if(cur_max <0)
			{
				cur_max=0;
				s=i+1;
			}
		}
		System.out.println(max_sum);
		System.out.println("start index is "+start+" end index is "+end);
	}
	
}
