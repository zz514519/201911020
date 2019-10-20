import java.util.Scanner;

//求解一元二次方程。
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入二次项系数：");
        double a = sc.nextDouble();
        System.out.println("请输入一次项系数：");
        double  b = sc.nextDouble();
        System.out.println("请输入常数项：");
        double c  = sc.nextDouble();
        project(a,b,c);
    }
    public static void project(double a,double b ,double c) {
        double S = b*b-4*a*c;
        double x1 = 0.0,x2 = 0.0;
        if(S<0){
            System.out.println("此方程无解！");
        }else if(S ==0){
            x1 = (-b)/(2*a);
            x2 = x1;
            System.out.println("此方程有两个相同的解");
        }else{
            x1 =  ((-b)+Math.sqrt(b*b-4*a*c))/(2*a);
            x2 = ((-b)-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("此方程有两个不相同的解");
        }
        System.out.println("x1="+x1+"   x2="+x2);
    }
}