import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] scores = new double[num];
        for(int i=0; i<num; i++)
            scores[i] = scan.nextInt();
        double max = scores[0];
        for(int i=0; i<num; i++){
            double temp = scores[i];
            if(temp > max)
                max = temp;
        }
        double sum = 0.0;
        for(int i=0; i<num; i++){
            scores[i] = (scores[i] / max) * 100;
            sum += scores[i];
        }
        System.out.println(sum / (double) num);
    }
}
