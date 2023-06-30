public class GugudanArray {
    public static void main(String[] args) {
        int[] result = new int[9];
        for(int k=2; k<10; k++) {
            System.out.println(k + "단의 출력 결과");
            for(int i=0; i<result.length; i++) {
                result[i] = k * (i + 1);
            }
            for(int j=0; j<result.length; j++) {
                System.out.println(result[j]);
            }
        }


//        int[] result = new int[9];
//        for(int i=0; i<result.length; i++) {
//            result[i] = 2 * (i + 1);
//        }
//        for(int j=0; j<result.length; j++) {
//            System.out.println(result[j]);
//        }
//
//        result = new int[9];
//        for(int i=0; i<result.length; i++) {
//            result[i] = 3 * (i + 1);
//        }
//        for(int j=0; j<result.length; j++) {
//            System.out.println(result[j]);
//        }
//
//        int[] result4 = new int[9];
//        for(int i=0; i<result.length; i++) {
//            result4[i] = 4 * (i + 1);
//        }
//        for(int j=0; j<result.length; j++) {
//            System.out.println(result4[j]);
//        }
    }
}
