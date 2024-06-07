package _240505_주말보충;

public class _05_ForAndWhile {
    //배열에서 두 번째로 큰 값
    public static void main(String[] args) {
        //
        int[] arr = {56, 78, 92, 42, 87, 64,88,89};
        //

        int max = arr[0];
        int found = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length;i++){
            if(max == arr[i]){

            } else if (arr[i]> found) {
                found = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(found);


    }
}
