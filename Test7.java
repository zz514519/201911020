//字母的大小写转换。
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字母：");
        char letter = sc.next().charAt(0);
        project(letter);
    }
    public static void project (char letter){
        if(letter>=97&&letter<=122){
            System.out.println("该字母为小写字母！");
            letter = (char)(letter - 32);
            System.out.println("转换后的大写字母是："+letter);
        }else{
            System.out.println("该字母是大写字母！");
            letter = (char)(letter + 32);
            System.out.println("转换后的小写字母是："+letter);
        }
    }
}
