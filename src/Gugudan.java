import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        // 6단
//        int i = 1;
//        while(i < 10) {
//            System.out.println(6 * i);
//            i = i + 1;
//        }

        // 7단
//        for(int j = 1; j < 10; j++) {
//            System.out.println(7 * j);
//        }
        // 8단, 9단
        System.out.println("출력하고 싶은 단을 입력하세요: ");
        Scanner s2 = new Scanner(System.in);
        int number = s2.nextInt();
        if(number > 9 || number < 2) {
            System.out.println("2이상 9이하의 값만 입력할 수 있습니다");
        } else {
            for(int k = 1; k < 10; k++) {
                System.out.println(number * k);
            }
        }


        // 2단
//        System.out.println("2단");
//        System.out.println(2 * 1);
//        System.out.println(2 * 2);
//        System.out.println(2 * 3);
//        System.out.println(2 * 4);
//        System.out.println(2 * 5);
//        System.out.println(2 * 6);
//        System.out.println(2 * 7);
//        System.out.println(2 * 8);
//        System.out.println(2 * 9);

        // 3단
//        System.out.println("3단");
//        System.out.println(3 * 1);
//        System.out.println(3 * 2);
//        System.out.println(3 * 3);
//        System.out.println(3 * 4);
//        System.out.println(3 * 5);
//        System.out.println(3 * 6);
//        System.out.println(3 * 7);
//        System.out.println(3 * 8);
//        System.out.println(3 * 9);

        // 4단
//        System.out.println("4단");
//        int result = 4 * 1;
//        System.out.println(result);
//        result = 4 * 2;
//        System.out.println(result);
//        result = 4 * 3;
//        System.out.println(result);
//        result = 4 * 4;
//        System.out.println(result);
//        result = 4 * 5;
//        System.out.println(result);

        // 5단
//        System.out.println("구구단 중 출력할 단은?: ");
//        Scanner s1 = new Scanner(System.in);
//        int number = s1.nextInt();
//        System.out.println(number * 1);
//        System.out.println(number * 2);
//        System.out.println(number * 3);
//        System.out.println(number * 4);
//        System.out.println(number * 5);
//        System.out.println(number * 6);
//        System.out.println(number * 7);
//        System.out.println(number * 8);
//        System.out.println(number * 9);
    }
}
