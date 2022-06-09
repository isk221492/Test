import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson5_6_8 {
    public static void main(String[] args) throws IOException {
        if (true) {
            System.out.println("同じ");
        }
        // 問題1
        // 数値を入力して10より小さくないときに入力された数値を出力する
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);
        if (!(num < 10)) {
            System.out.println(num);
        }

        // 問題2
        // 10回入力して「10より小さい数の回数」を出力する
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int num1 = Integer.parseInt(br.readLine());
            if (num1 < 10) {
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);

    }

}
