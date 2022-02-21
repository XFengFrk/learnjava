import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("请输入需要转换的温度（摄氏度）：");
        Scanner in = new Scanner(System.in);
        double tem = in.nextDouble();
        double out = tem*9/5 + 32;
        System.out.println("转换欧虎得到的温度（华氏度）" + out);
    }
}
