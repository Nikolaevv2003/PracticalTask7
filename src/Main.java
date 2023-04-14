import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Николаев Александр Сергеевич");
        System.out.println("РИБО-01-21");

        Scanner input = new Scanner(System.in);
        System.out.print("Введите числовую последовательность через запятую: ");
        String[] numbers = input.nextLine().split(",");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i].trim());
        }
        MinThread minThread = new MinThread(nums);
        MaxThread maxThread = new MaxThread(nums);
        minThread.start();
        maxThread.start();
        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Минимальное значение: " + minThread.getMin());
        System.out.println("Максимальное значение: " + maxThread.getMax());
    }
}