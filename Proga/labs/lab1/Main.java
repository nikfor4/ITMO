import java.util.Random;

public class Main {

    public  static short[] Evens(short end) {
        short[] even = new short[end];
        for (int i = 0; i < end; i++) {
            even[i] = (short) (22 - i * 2);
        }
        return even;
    }
    public static double[] DoubleRand(int length, double range_bot, double range_top){
        double[] arr = new double[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextDouble(range_bot,range_top);
        }
        return arr;
    }
    public static double[][] Transformation(double[] double_arr, short[] short_arr,int width, int length){
        double[][] double_two_dimensiona = new double[width][length];
        for (int i = 0; i < width; i++){
            for (int j = 0; j < length; j++){
                if (short_arr[i] == 8){
                    double_two_dimensiona[i][j] = Math.cos(Math.pow(((Math.tan(double_arr[j]-0.25) ) / 3 ) / 4, 3));

                }
                if (short_arr[i] == 4 | short_arr[i] == 10 | short_arr[i] == 12 | short_arr[i] == 14 | short_arr[i] == 18) {

                    double_two_dimensiona[i][j] = Math.pow(Math.cos((Math.asin((double_arr[j] + 5.5)/17))), 3);


                } else {
                    double_two_dimensiona[i][j] = Math.pow(Math.E, Math.asin(1/(Math.pow(Math.E,Math.pow(2*(Math.PI/2 + Math.sqrt(Math.abs(double_arr[j]))),2)))));
                }



        }
    }
        return double_two_dimensiona;
    }
    public static void Print_Output(double[][] arr) {
        String print;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                print = String.format("%4.2f", arr[i][j]);
                System.out.print(print + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] arg) {

        short[] w = Evens((short) ((22 - 4) / 2 + 1));
        double[] x = DoubleRand(17,-3.0, 14.0);
        double[][] n = Transformation(x,w,10,17);

        Print_Output(n);



    }
}