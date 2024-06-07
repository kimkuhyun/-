package _240505_주말보충;

public class _02_02_ForAndWhile {
    public static void main(String[] args) {
        // 중복 검사 후 특정 문자를 제거하고 배열을 변경하는 코드
        String[] arr = {"a", "d", "e", "b", "f", "c", "d"};
        String[] rra = {"a", "b", "c"};
        int index = 0;
        boolean found;



        for (int i = 0; i < arr.length; i++) {
            found = false;
            for (int j = 0; j < rra.length; j++) {
                if (arr[i].equals(rra[j])) {
                    index++;
                    break;
                }

            }

        }

        int count  = arr.length - index;
        String[] checkArr = new String[count];
        int idx = 0;

        for (int k = 0; k <  arr.length; k++){
            found = false;
            for(int l = 0; l< rra.length; l++){
                if(arr[k].equals(rra[l])){
                    found = true;
                    break;
                }
            }
            if(!found){
                checkArr[idx++] = arr[k];
            }
        }

        for(String z : checkArr){
            System.out.print(z + ", ");
        }






    }
}
