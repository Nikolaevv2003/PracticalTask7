public class MinThread extends Thread {
    private int[] nums;
    private int min;
    public MinThread(int[] nums) {
        this.nums = nums;
    }
    public void run() {
        min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
    }
    public int getMin() {
        return min;
    }
}
