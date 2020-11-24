import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] ar=new int[n];
        int count=0;
        for (int i = 0; i < n; i++)ar[i]=in.nextInt();
        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (Math.abs(ar[i]-ar[j])==(k)) count++;
                else if(Math.abs(ar[j] - ar[i]) > k) break;
            }
        }
        System.out.println(count);
    }
}
