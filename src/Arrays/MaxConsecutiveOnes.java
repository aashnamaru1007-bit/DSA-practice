package Arrays;

public class MaxConsecutiveOnes {
    int[] nums = {1, 1, 0, 1, 1, 1};

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        maxcount = Math.max(maxcount, count); // catch a trailing run of 1s
        return maxcount;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int result = obj.findMaxConsecutiveOnes(obj.nums);
        System.out.println("Max consecutive ones: " + result);
    }
}