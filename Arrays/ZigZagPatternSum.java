import java.util.* ;
import java.io.*; 

public class ZigZagPatternSum {

	public static int maximumSumZigzag(int n, int[] arr) {
	int inc[] = new int[n];
	int dec[] = new int[n];
	inc[0] = arr[0];
	dec[0] = arr[0];

	for(int i = 1; i < n; i++){
		for(int j = 0; j < i; j++){
			if(arr[i] > arr[j]){
				inc[i] = Math.max(inc[i], dec[j]+arr[i]);
			}
			if (arr[i] < arr[j]) {
				dec[i] = Math.max(dec[i], inc[j]+arr[i]);
			}
		}
	}
	int ans = 0;
	for (int i = 0; i < n; i++) {
		ans = Math.max(ans, inc[i]);
		ans = Math.max(ans, dec[i]);
	}
		return ans;

	}

}
