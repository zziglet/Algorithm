import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//무한루프
		while(true) {
			String S = br.readLine();
			StringBuilder sb = new StringBuilder(S);
			//string builder 객체 선언
			String Sreverse = sb.reverse().toString();
			//sb 객체를 reverse 한 뒤 string으로 변환하여 저장
            
			if(S.equals("0")) break;
			
			if(S.equals(Sreverse)) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

}
