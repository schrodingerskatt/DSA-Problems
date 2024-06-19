// Problem Link : https://www.naukri.com/code360/problems/house-robber_839733?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM

public class HouseRobberII {

    public static long houseRobber(int[] valueInHouse) {
		int n = valueInHouse.length;
		if(n == 1){
			return valueInHouse[0];
		}
		if(n == 2){
			return Math.max(valueInHouse[0], valueInHouse[1]);
		}

		long take_first = excludeInclude(valueInHouse,0,n-2);
		long skip_first = excludeInclude(valueInHouse, 1, n-1);
		return Math.max(take_first, skip_first);
	}	

	public static long excludeInclude(int[]valueInHouse, int start, int end){
		long old_include = 0;
		long old_exclude = 0;

		for(int i = start; i <= end; i++){
			long skip = old_include;
			long include = old_exclude+valueInHouse[i];
			long maxima = Math.max(skip, include);
			old_exclude = old_include;
			old_include = maxima;

		}
		return old_include;
	}
    
}
