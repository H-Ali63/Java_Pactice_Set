package Haidar;

import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,34,5,2,54,63};
		changedvalue(arr);
		System.out.print(Arrays.toString(arr));
//		if you want to make a change to object via this reference variable, same object will be changed.
	}
	static void changedvalue(int[] nums) {
		nums[0] = 100;
	}

}
