import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int money=in.nextInt();
        int a1=in.nextInt(),a2=in.nextInt(),a3=in.nextInt();
        int r=money-a1*15-a2*20-a3*30;
        int a50,a5,a11;
        if(r<0)
            System.out.println(0);
        else
        {
            a50=r/50;
            a5=(r%50)/5;
            a11=r%5;
            System.out.println(a11+"\n"+a5+"\n"+a50);
        }
    }
}