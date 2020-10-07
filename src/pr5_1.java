import java.util.Scanner;

public class pr5_1 {
    public static void function() {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int k = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(k);
            if(k * (k + 1) / 2 == i){
                k++;
            }
        }
    }
    public static void main(String[] args){
        function();
    }
}
