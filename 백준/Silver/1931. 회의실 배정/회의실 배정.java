import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] session = new int[n][2];

        for(int i = 0; i < n; i++){
            session[i][0] = sc.nextInt();
            session[i][1] = sc.nextInt();
        }

        Arrays.sort(session, new Comparator<int[]>() {
            @Override
            public int compare(int[]t1,int[]t2){
                if(t1[1] == t2[1]){
                    return t1[0] - t2[0];
                }
                return t1[1] -  t2[1];
            }
        });

        int count = 0;   
        int pre_end_time = 0;

        for(int i = 0; i < n; i++){
            if(pre_end_time <= session[i][0]){
                pre_end_time = session[i][1];
                count++;
            }
        }
        System.out.println(count);

    }
}
