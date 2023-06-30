import java.util.Scanner;

public class GugudanString {
    public static int[] calculate(int times) {

        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] items){
        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        String inputValue = s1.nextLine();
        String[] splitedValue = inputValue.split(",");
        int firstNum = Integer.parseInt(splitedValue[0]);
        int secondNum = Integer.parseInt(splitedValue[1]);

        int[] result1 = calculate(firstNum);
        print(result1);

        int[] result2 = calculate(secondNum);
        print(result2);

    }
}
