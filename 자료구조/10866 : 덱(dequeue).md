## 문제
![](https://velog.velcdn.com/images/zziglet/post/6c3556a5-8a5f-420a-bd7b-03c6e7e3887c/image.png)

## 문제 이해
- push_front X : 정수 X를 덱의 앞(먼저 넣는)에 넣는다.
- push_back X : 정수 X를 덱의 뒤(나중에 넣는)에 넣는다.
- pop_front : 덱의 가장 앞에 있는(먼저 넣은) 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- pop_back : 덱의 가장 뒤에 있는(나중에 넣은) 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size : 덱에 들어있는 정수의 개수를 출력한다.
- empty : 덱이 비어있으면 1을, 아니면 0을 출력한다.
- front : 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- back : 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

## 문제 접근
- arraylist로 구현함
- stack과 queue의 구현 합침(dequeue는 양쪽으로 삽입,삭제가 가능한 자료구조)

## 내 풀이
```
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
```

- arraylist로 구현했지만 다른 자료구조 구현법이 많음
- arrayqueue, dequeue, linkedlist 등 다양한 자료구조로 구현 가능
