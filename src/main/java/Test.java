import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test {
    private static boolean[] customer = new boolean[1_000_001];
    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int reserved = Integer.parseInt(st.nextToken());


            if(customer[idx] && reserved == 0){
                customer[idx] = false;
                count--;

                while(count < K && !queue.isEmpty()){
                    int ready = queue.poll();

                    customer[ready] = true;
                    count++;
                }

                continue;
            }

            if (reserved == 1){
                if(count == K){
                    queue.offer(idx);
                    continue;
                }

                count++;
                customer[idx] = true;
            }
            else {
                customer[idx] = false;
            }
        }

        for(int i = 0; i < customer.length; i++){
            if(customer[i]) System.out.print(i + " ");
        }
        System.out.println();
    }

}
