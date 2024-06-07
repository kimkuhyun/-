package _240505_주말보충;

public class _03_ForAndWhile {
    //배열 요소의 평균 및 최댓값,최소값 구하기
    public static void main(String[] args) {
        int[] arr = {56, 78, 92, 42, 87, 64};

        int sum = 0;
        double avg;

        //합
        for(int num : arr){
            sum += num;
        }
        //평균
        avg = (double) sum/arr.length;
        System.out.println(avg);

        //최댓값
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
                if (arr[i] > max) {
                    max = arr[i];
                }
        }

        System.out.println(max);
        //최소값
        int min = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);






    }
}
