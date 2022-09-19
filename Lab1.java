public class Lab1 {
    private static short[] getArrayA() {
        short[] a=new short[11];
        int index=0;
        for(int i=22;i>=2;i=i-2){
            a[index]=(short)i;
            index+=1;
        //    System.out.println(i);
        }
        return a;
    }
    private static double[] getArrayX() {
        double[] x=new double[12];
        for(int i=0;i<12;i++){
            x[i]=  ((Math.random() * (10 - (-10))) + (-10));

        }
        return x;
    }
    private static void formatPrint(double array[][]){
        for(int i = 0; i<11; i++){
            for(int j = 0; j<12; j++){
               printf("%10.4f", array[i][j]);
            }
            print("\n");
        }
    }

    public static void main(String[] args) {


        double[][] t=new double[11][12];
        short a[]=getArrayA();
        double x[]=getArrayX();
        for(int i=0;i<11;i++){
            for(int j=0;j<12;j++) {
                switch (a[i]){

                    case  12:
                        t[i][j] = Math.pow((Math.pow(2 * Math.tan(x[j]), 3) - 1 / 3.0), (Math.sin(Math.pow(x[j], x[j] / 4))));
                        break;
                    case 6,8,10,14,16:
                        t[i][j] = Math.atan(Math.pow(Math.E,Math.cbrt((-1)*Math.pow(Math.tan(x[j]),2))));
                        break;


                    default:
                        t[i][j] = Math.cbrt(Math.atan(1 / (Math.pow(Math.E, Math.pow(Math.tan(Math.pow(2 / (Math.asin(x[j] / 2 * Math.E + 1) - 1 / 4.0), Math.log(Math.abs(x[j])))), 2)))));
                        break;
                }
            }
        }
        formatPrint(t);
    }


    public static void print(String m){
        System.out.print(m);
    }
    public static void printf(String p,double x){
        System.out.printf(p,x);
    }



}

