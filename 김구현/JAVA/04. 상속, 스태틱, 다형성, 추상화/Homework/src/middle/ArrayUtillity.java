package middle;

public class ArrayUtillity {
    static double[] intToDouble(int[] source){

        double[] sourceDouble = new double[source.length];

        for(int i = 0; i < source.length; i++){
            sourceDouble[i] = source[i];
        }
        return sourceDouble;
    } // int배열을 double배열로 변환

    static int[] doubleToInt(double[] source){
        int[] sourceInt = new int[source.length];
        for(int i = 0; i < source.length; i++){
            sourceInt = new int[source.length];
        }
        return sourceInt;
    } // double배열을 int배열로 변환
}
