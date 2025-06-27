public class one {
    static int [] searchRange(int[] nums, int target){
        int[] result = {-1, -1};
        result[0] =bound(nums, target, true);
        if (result[0] != -1){
            result[1] = bound(nums, target, false);
        }
        return  result;
    }
    static int bound(int[] nums, int target, boolean isfirst){
        int left = 0;
        int right = nums.length -1;
        int bound = -1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (nums[mid] == target){
                bound = mid;
                if (isfirst){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return bound;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 8, 10};
        int target = 8;

        int [] result = searchRange(nums, target);
        System.out.println("Output:" + result[0] + "," + result[1]);
    }
}
