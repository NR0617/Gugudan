public class GugudanMethod {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for(int i=0; i<result.length; i++) {
            result[i] = times*(i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result2 = calculate(2);
        for(int i=0; i<result2.length; i++) {
            System.out.println(result2[i]);
        }
        int[] result3 = calculate(3);
        for(int i=0; i<result3.length; i++) {
            System.out.println(result3[i]);
        }
        int[] result4 = calculate(4);
        for(int i=0; i<result4.length; i++) {
            System.out.println(result4[i]);
        }
    }
}
