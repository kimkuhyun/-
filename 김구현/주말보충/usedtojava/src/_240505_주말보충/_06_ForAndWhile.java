package _240505_주말보충;

public class _06_ForAndWhile {
    //두 개의 정수 배열에서 공통된 요소 찾기
    public static void main(String[] args) {

        //
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        //

        boolean found;
        int index = 0;
        int[] foundArr = new int[arr1.length];
        int idx = arr1.length;

        for(int i = 0; i <arr1.length; i++) {
            found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    foundArr[index++] = arr1[i];
                    idx--;
                }
            }
        }

        int[] result = new int[foundArr.length - idx-1];
        int index2 = 0;

        for(int i =0; i <arr1.length;i++){
            found = false;
            for (int j = 0; j <arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    found= true;
                    break;
                }
            }

            if(!found){
                result[index2++] = arr1[i] ;
            }

        }

        for (int k : result){
            System.out.print(k+", ");
        }

    }

}
