package _240505_주말보충;

public class _04_ForAndWhile {
    //배열 요소의 평균, 최댓값, 최솟값, 그리고 특정 값의 총 개수 구하기
    public static void main(String[] args) {
        //
        int[] arr = {56, 78, 92, 42, 87, 64};
        //
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int choice = 56;
        int cunt = 0;

        for(int num : arr){
            sum += num;
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            if(choice == num){
                cunt++;
            }
        }

        double avg = (double) sum / arr.length;
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);
        System.out.println(cunt);




    }
}
