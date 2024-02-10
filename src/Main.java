public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int monthSum = 0;
        for (int day : arr) {
            monthSum += day;
        }
        System.out.println("Сумма трат за месяц составила " + monthSum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minDay = 200000;
        int maxDay = 0;
        for (int day : arr) {
            if (maxDay < day) {
                maxDay = day;
            }
            if (minDay > day) {
                minDay = day;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDay + " рублей. Максимальная сумма трат за день составила " + maxDay + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int monthSum = 0;
        for (int day : arr) {
            monthSum += day;
        }
        float middleMonth = (float) monthSum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleMonth + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 1; i < reverseFullName.length + 1; i++) {
            System.out.print(reverseFullName[reverseFullName.length - i]);
        }
        System.out.println();
    }
}