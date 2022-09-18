public class Lab1 {
    private static short[] GetA() {
        short[] a=new short[11];
        int index=0;
        for(int i=22;i>=2;i=i-2){
            a[index]=(short)i;
            index+=1;

        }
        return a;
    }
    private static double[] GetX() {
        double[] x=new double[12];
        for(int i=0;i<12;i++){
            x[i]=  ((Math.random() * (10 - (-10))) + (-10));

        }
        return x;
    }
    private static void FormatPrint(double array[][]){
        for(int i = 0; i<11; i++){
            for(int j = 0; j<12; j++){
                System.out.printf("%10.4f", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        double[][] t=new double[11][12];
        short a[]=GetA();
        double x[]=GetX();
        for(int i=0;i<11;i++){
            for(int j=0;j<12;j++){
                if(a[i]==12){
                    t[i][j]=Math.pow((Math.pow(2*Math.tan(x[j]),3)-1/3.0),(Math.sin(Math.pow(x[j],x[j]/4))));

                }else if(a[i]==6 || a[i]==8|| a[i]==10||  a[i]==14 || a[i]==16){
                    t[i][j]=Math.atan(Math.pow(Math.E,Math.cbrt((-1)*Math.pow(Math.tan(x[j]),2))));

                }else{
                    t[i][j]=Math.cbrt(Math.atan(1/(Math.pow(Math.E,Math.pow(Math.tan(Math.pow(2/(Math.asin(x[j]/2*Math.E+1)-1/4.0),Math.log(Math.abs(x[j])))),2)))));
                }
            }
        }
        FormatPrint(t);
    }
}
