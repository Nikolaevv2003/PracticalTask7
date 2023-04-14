public class MaxThread extends Thread {
    private int[] nums;
    private int max;
    public MaxThread(int[] nums) {
        this.nums = nums;
    }
    public void run() {
        max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
    }
    public int getMax() {
        return max;
    }
}
