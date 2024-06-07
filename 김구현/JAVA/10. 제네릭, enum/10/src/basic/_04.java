package basic;

import java.util.List;

public class   _04<T extends Number> {
    //4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.

    public void prinArr(List<T> list){
       for(int i=0; i<list.size(); i++){
           if(i % 3 == 0){
               System.out.println(list.get(i)+", ");
           }
       }

    }
}
