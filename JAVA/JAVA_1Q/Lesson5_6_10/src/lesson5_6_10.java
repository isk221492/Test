import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.lang.model.util.ElementScanner14;

/**
 * lesson5_6_10
 * 10個の値を入力したのち、
 * 最大値と最小値、平均値、重複入力された値とその入力回数を出力せよ
 */
public class lesson5_6_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        int max = 0;
        int min = 0;

        // 一回目だけ別処理で記述 ※ただしif(i=0)でfor文の中で実行することもできる！！
        int num = Integer.parseInt(br.readLine());
        int sum = num;
        max = num;
        min = num;
        list[0] = num;
        // ここまで

        //int[] dlist = new int[10];
        //int dcnt = 0;

        for (int i = 0; i < 9; i++) {
            num = Integer.parseInt(br.readLine());
            sum = sum + num;

            if (max < num) {
                max = num;
            }

            if (min > num) {
                min = num;
            }
            list[i + 1] = num;

            /*
             * 【バブルソート】
             * i番左とj番目を比較して、i番目が大きければ、
             * 入れ替えてj番目を一番左に持ってくる（最小値が一番左にくる）
             * 
             * for(int i=0; i<list.length; i++){
             * for(int j=i+1; j<list.length; j++){
             * if(list[i]>list[j]){
             * int tmp = list[i];
             * list[i] = list[j];
             * list[j] = tmp;
             * }
             * }
             * }
             * 
             * System.out.println(”最大値は”+list[list. length-1]);
             * System.out.println(”最小値は”+list[0]);
             * System.out.println(”平均値は”+sum/list. length);
             */
        }
        System.out.println("最大値は" + max + "：最小値は" + min);
        System.out.println("平均値は" + sum / 10);

        // 昇順に並び替えている前提で
        for (int i = 0; i < list.length - 1; i++) {
            int cnt = 0;
            for (int j = i + 1; (i < list.length) && (list[i] == list[j]); j++) {
                cnt = cnt + 1;
            }
            if (cnt != 0) {
                System.out.println(list[i] + "は" + (cnt + 1) + "回です");
                i = i + cnt;
            }
        }

        // System.out.println("重複入力された値は" + dlist);
        // System.out.println("重複入力された回数は" + dcnt);

        //入力された値が10以上100未満のときに「yes」、負の数のとき「マイナス」、それ以外は「No」
        if((num>=10)&&(num<100)){
            System.out.println("yes");
        }else{
            if(num<0){
                System.out.println("マイナス");
            }else{
                System.out.println("no");
            }
        }
        


        //入力された値が10未満か、100以上のときに「yes」
        if((num<10)||(num>=100)){
            System.out.println("yes");
        }

    }
}