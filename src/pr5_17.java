import java.util.Scanner;
public class pr5_17 {
    public static int recursion(){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n == 0){
            return 1;
        }
        return Math.max(n, recursion());
    }
    public static void main(String[] args){
        System.out.println("Max element is " + recursion());
    }
}


