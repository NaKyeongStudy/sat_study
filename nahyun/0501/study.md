<h1>5.01 study</h1>

- 백준 counting sort 문제 풀기

    - ``` c
        #include <stdio.h>

        int main() {
            int num, nnum;
            int count[10001] = { 0 };

            scanf("%d", &num);

            for (int i = 0; i < num; i++) {
                scanf("%d", &nnum);
                count[nnum]++;
            }

            for (int i = 0; i <= 10000; i++) {
                for (int j = 0; j < count[i]; j++) {
                    printf("%d\n", i);
                }
            }
        }
        ```


    - 함수와 메모리를 최소한으로 써서 풀수 있었다!


- 자바 사용하기
    - 백준 통계학 문제 풀기
    - 다음 문제부터는 자바로!

    - ``` java
        import java.util.*;
        import java.io.*;

        public class Main {
            public static void main(String args[]) {
                InputStream inputStream = System.in;
                OutputStream outputStream = System.out;
                InputReader in = new InputReader(inputStream);
                PrintWriter out = new PrintWriter(outputStream);
                StringBuilder sb = new StringBuilder();
                int N = in.nextInt();
                int count[] = new int[8001];
                int sum =0;
                int input;
                for(int i = 0; i<N;i++){
                    input = in.nextInt();
                    sum += input;
                    count[input+4000]++;
                }
                int temp =0;
                int i =0;
                for(; i<8001;i++){
                    if(temp>N/2) break;
                    temp += count[i];
                }
                int cb=0;
                int cb_max = 0;
                int cb_count=1;
                for(int j =0; j<8001; j++){
                    if(cb_max<count[j]) {
                        cb_max = count[j];
                        cb=j;
                        cb_count=1;
                    }
                    else if(cb_max==count[j]&&cb_count==1){
                        cb_count=2;
                        cb=j;
                        cb_max = count[j];
                    }
                }
                int min=0;
                int max=0;
                for(int j =0; j<8001; j++){
                    if(count[j]>0) {
                        min = j;
                        break;
                    }
                }
                for(int j =0; j<8001; j++){
                    if(count[8000-j]>0) {
                        max = 8000-j;
                        break;
                    }
                }
                int bound = max-min;
                double average = (double)sum/(double)N;

                sb.append(Math.round(average)).append("\n").append(i-4001).append("\n").append(cb-4000).append("\n").append(bound);
                System.out.println(sb);
            }
        }
        class InputReader {
            public BufferedReader reader;
            public StringTokenizer tokenizer;

            public InputReader(InputStream stream) {
                reader = new BufferedReader(new InputStreamReader(stream), 32768);
                tokenizer = null;
            }

            public String next() {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    try {
                        tokenizer = new StringTokenizer(reader.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return tokenizer.nextToken();
            }
            public int nextInt() {
                return Integer.parseInt(next());
            }

        }
        ```

