import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> inst = new ArrayList<>();
        ArrayList<Integer> dequeue = new ArrayList<>();
        ArrayList<Integer> print = new ArrayList<>();

        //buffered reader 사용할 때에는 readLine 처리 불필요

        for(int i=0; i<num; i++){
            inst.add(br.readLine());
        }
        for(int i=0; i<num; i++){
            String[] info = inst.get(i).split(" ");
            switch (info[0]) {
                case "push_front":
                    dequeue.add(0, Integer.parseInt(info[1]));
                    break;
                case "push_back":
                    dequeue.add(Integer.parseInt(info[1]));
                    break;
                case "pop_front":
                    if (dequeue.isEmpty())
                        print.add(-1);
                    else{
                        print.add(dequeue.get(0));
                        dequeue.remove(0);
                        //arraylist는 중간 데이터가 삭제되면 하나씩 당겨짐
                    }
                    break;
                case "pop_back":
                    if (dequeue.isEmpty())
                        print.add(-1);
                    else{
                        print.add(dequeue.get(dequeue.size()-1));
                        dequeue.remove(dequeue.size()-1);
                        //arraylist는 중간 데이터가 삭제되면 하나씩 당겨짐
                    }
                    break;
                case "size":
                    print.add(dequeue.size());
                    break;
                case "empty":
                    if (dequeue.isEmpty())
                        print.add(1);
                    else
                        print.add(0);
                    break;
                case "front":
                    if (dequeue.isEmpty())
                        print.add(-1);
                    else
                        print.add(dequeue.get(0));
                    break;
                case "back":
                    if (dequeue.isEmpty())
                        print.add(-1);
                    else
                        print.add(dequeue.get(dequeue.size() -1));
                    break;
            }

        }
        for (Integer integer : print) System.out.println(integer);
    }
}
