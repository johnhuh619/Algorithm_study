import java.util.Scanner;

public class Main    {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int count = 0; 
        int n = sc.nextInt();
        int targetValue = sc.nextInt();
        
        int[] arr = new int[n];
       

        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = n-1; i >= 0; i--){
            if(arr[i] <= targetValue){
                count += (targetValue / arr[i]);
                targetValue = targetValue % arr[i];
            }
        }
        System.out.println(count);
        sc.close();
    }
}
