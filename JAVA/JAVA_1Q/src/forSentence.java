/**
 * forSentence
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forSentence 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("何段*を出力しますか？");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int row = Integer.parseInt(str);
		
		System.out.println("何個ずつ*を出力しますか？");
		

		String str2 = br.readLine();
		int col = Integer.parseInt(str2);
		
		
		
		for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=col; j++) 
            {
                System.out.print("*");
            }
			System.out.println("\n");
        }
    }
}