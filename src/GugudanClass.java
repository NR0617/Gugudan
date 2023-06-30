import java.util.Scanner;

public class GugudanClass {
    public static void main(String[] args) {
        System.out.println("출력하고 싶은 구구단의 단을 숫자로 입력하세요 : ");
        Scanner s1 = new Scanner(System.in);
        int var = s1.nextInt();
        int[] result = GugudanClass2.calculate(var);
        GugudanClass2.print(result);

    }
}
