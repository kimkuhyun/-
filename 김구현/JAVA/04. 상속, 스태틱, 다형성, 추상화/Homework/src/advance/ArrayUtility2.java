package advance;

public class ArrayUtility2 {

    static int[] concat(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++) {
            result[i] = s1[i];
            result[i] = s2[i];
        }
        return result;

    }    // s1과 s2를 연결한 새로운 배열 리턴


    static int[] remove(int[] s1, int[] s2) {
        //s1 = {1, 2, 3}
        //s2 = {2, 4, 5}
        //s3 = {1, 3} new int[s1.length - 중복개수]
        public static int[] remove(int[] s1, int[] s2) {

            int[] indexArr = new int[s1.length];

            int index = 0;
            int dupCnt = 0;

            for(int i = 0; i < s1.length; i++) {
                for(int j = 0; j < s2.length; j++) {
                    if(s1[i] == s2[j]) {
                        indexArr[index++] = i;
                        dupCnt++;
                        break;
                    }
                }
            }

            int[] returnArr = new int[s1.length - dupCnt];

            index = 0;

            for(int i = 0; i < s1.length; i++) {
                boolean isDup = false;

                for(int j =0 ; j < dupCnt; j++) {
                    if(i == indexArr[j]) {
                        isDup = true;
                        break;
                    }
                }

                if(isDup) {
                    continue;
                }

                returnArr[index++] = s1[i];
            }

            return returnArr;


    }
}

    	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴


