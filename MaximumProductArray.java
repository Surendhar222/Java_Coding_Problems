public class MaximumProductArray {
	public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int prefix = 0 , suffix = 0 , ans = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(prefix == 0){prefix = 1;}
            if(suffix == 0){suffix = 1;}

            prefix = prefix*nums[i];
            suffix = suffix*nums[nums.length-i-1];
            ans = Math.max(ans , Math.max(prefix, suffix));
        }
        System.out.println(ans);
    }
}