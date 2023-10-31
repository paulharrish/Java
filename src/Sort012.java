
public class Sort012 {
    public static void main(String[] args) {
        int[] inputArray = { 2, 2, 1, 0, 1 };
        sort(inputArray);

        for (int num : inputArray) {
            System.out.print(num + " ");
        }

    }

    public static void sort(int[] nums) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int num : nums) {
            switch (num) {
                case 0:
                    count_0++;
                    break;
                case 1:
                    count_1++;
                    break;
                case 2:
                    count_2++;
                    break;
            }
        }
        int i = 0;
        while (count_0 > 0) {
            nums[i] = 0;
            count_0--;
            i++;
        }
        while (count_1 > 0) {
            nums[i] = 1;
            count_1--;
            i++;
        }
        while (count_2 > 0) {
            nums[i] = 2;
            count_2--;
            i++;

        }

    }

}
