import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={0,sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int t[] = new int[101];
        for(int j=0;j<3;j++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int i=x; i<y;i++) t[i]++;
        }
        int total =0;
        for(int i=0;i<100;i++){total+=a[t[i]]*t[i];}
        System.out.println(total);

    }
}
