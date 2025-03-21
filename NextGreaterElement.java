public class NextGreaterElement{
	public static void main(String[] args) {
        int[] nums1 = {4 , 1 , 2};
        int[] nums2 = {1 , 3 , 4 , 2};
        greaterElement(nums1 , nums2);
    }
    private static int[] greaterElement(int[] nums1 , int[] nums2){
        if (nums1.length < 2) {
            return nums1;
        }
         if (nums2.length < 2) {
            return nums1;
        }
        for(int i = 0 ; i < nums1.length ; i++){
            int greater = -1 , j = nums2.length-1;
            while(j >= 0 && nums1[i] != nums2[j]){
                if(nums1[i] < nums2[j]){
                    greater = nums2[j];
                }
            }
            nums1[i] = greater;
    }
    return nums1;
}
}

