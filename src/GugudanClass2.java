public class GugudanClass2 {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for(int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }
    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
