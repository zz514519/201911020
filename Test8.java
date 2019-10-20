import java.util.Scanner;

//3个正数，判断能否构成一个三角形。
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个正整数！");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        project(a, b, c);
    }

    public static void project(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("输入的必须是正整数！");
        }
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("能构成三角形！");
        } else {
            System.out.println("不能构成三角形！");
        }
    }
}