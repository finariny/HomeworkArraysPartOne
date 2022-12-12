import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        float [] secondArray = {1.57F, 7.654F, 9.986F};

        String [] thirdArray = new String[5];
        thirdArray[0] = "Cat";
        thirdArray[1] = "Dog";
        thirdArray[2] = "Rat";
        thirdArray[3] = "Horse";
        thirdArray[4] = "Pig";
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = 0; i < firstArray.length; i++) {
            if (i != firstArray.length - 1) {
                System.out.print(firstArray[i] + ", ");
            } else {
                System.out.print(firstArray[i]);
            }
        }

        System.out.println();

        float [] secondArray = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < secondArray.length; i++) {
            if (i != secondArray.length - 1) {
                System.out.print(secondArray[i] + ", ");
            } else {
                System.out.print(secondArray[i]);
            }
        }

        System.out.println();

        String [] thirdArray = new String[5];
        thirdArray[0] = "Cat";
        thirdArray[1] = "Dog";
        thirdArray[2] = "Rat";
        thirdArray[3] = "Horse";
        thirdArray[4] = "Pig";
        for (int i = 0; i < thirdArray.length; i++) {
            if (i != thirdArray.length - 1) {
                System.out.print(thirdArray[i] + ", ");
            } else {
                System.out.print(thirdArray[i]);
            }
        }
    }

    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(firstArray[i] + ", ");
            } else {
                System.out.print(firstArray[i]);
            }
        }

        System.out.println();

        float [] secondArray = {1.57F, 7.654F, 9.986F};
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(secondArray[i] + ", ");
            } else {
                System.out.print(secondArray[i]);
            }
        }

        System.out.println();

        String [] thirdArray = new String[5];
        thirdArray[0] = "Cat";
        thirdArray[1] = "Dog";
        thirdArray[2] = "Rat";
        thirdArray[3] = "Horse";
        thirdArray[4] = "Pig";
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(thirdArray[i] + ", ");
            } else {
                System.out.print(thirdArray[i]);
            }
        }
    }

    public static void task4 () {
        System.out.println();
        System.out.println("Задача 4");
        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }
        System.out.print(Arrays.toString(firstArray));
    }
}