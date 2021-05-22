import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Input the values a and b");
        a=in.nextInt();
        b=in.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float mod=a%b;
        System.out.println("Sum="+
        sum+"Sub="+sub+"Mul="+mul+"Mod="+mod);
    }
}
