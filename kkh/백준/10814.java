import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String args[]) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        StringBuilder sb = new StringBuilder();             //여기까지는 걍 끌어다 쓴

        int N = in.nextInt();
        int[] age = new int[N];
        String[] name = new String[N];
        for(int i = 0; i<N; i++){
            age[i] = in.nextInt();
            name[i] = in.next();
        }

        sort(age,name,0,N-1);

        for(int i=0; i<N;i++){
            sb.append(age[N-1-i]).append(' ').append(name[N-1-i]).append('\n');
        }
        System.out.println(sb);  //출력 부분
    }
    static void sort(int[] age, String[] name, int low, int high){
        if(high == low) {
            //System.out.println(high+"high==low");
            return;
        }
        //System.out.println("low : " + low + " high : " + high);
        int mid = (low+high)/2;
        sort(age,name,low,mid);
        sort(age,name,mid+1,high);
        merge(age,name,low,mid,high);
    }
    static void merge(int[] age, String[] name, int low, int mid, int high){
        int[] newage = new int[high-low+1];
        String[] newname = new String[high-low+1];
        int left = low, right = mid+1;
        int i =0;
        do{
            if(age[left] <= age[right]) {
                newage[i]=age[right];
                newname[i++] = name[right++];
            }
            else{
                newage[i] = age[left];
                newname[i++] = name[left++];
            }
        }while(left<=mid && right<=high);

        while(left<=mid){
            newage[i] = age[left];
            newname[i++] = name[left++];
        }
        while(right<=high){
            newage[i] = age[right];
            newname[i++] = name[right++];
        }
        for(i =0; i<(high-low+1);i++){
            age[low+i] = newage[i];
            name[low+i] = newname[i];
        }
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