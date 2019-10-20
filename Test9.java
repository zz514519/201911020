import java.util.Scanner;
//编写程序，从键盘输入一个0~99999之间的任意数，判断输入的数是几位数。
 public class Test9 {
     public static void  main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入一个数!");
         int num = sc.nextInt();
         project(num);
     }
     public static void project(int num) {
         int count = 0;
         while (num!= 0){
             num /=10;
             ++count;
         }
         System.out.println("您输入的数字有"+count+"位");
     }
 }
