package _240505_주말보충;

public class _02_01_ForAndWhile {
    public static void main(String[] args) {
        ///null값이 뜸 왜??
        String[] arr = {"a","d","e","b","f","c","d"};
        String[] rra = {"a","b","c"};

        int index = 0;

        boolean found;

        for(int i = 0; i < arr.length;i++) {
            found = false;
            for (int j = 0; j < rra.length; j++) {
                if (arr[i].equals(rra[j])) {
                    found = true;
                    break;
                }
                if (!found){
                    index++;
                }
            }

        }

        String[] finalArr  = new String[index];
        int idx =0;

        for(int i = 0; i < arr.length;i++) {
            found =false;
            for (int j = 0; j < rra.length; j++) {
                if (arr[i].equals(rra[j])) {
                    found = true;
                    break;
                }

            }
                if (!found) {
                    finalArr[idx++] = arr[i];

                }

        }
        for(String k : finalArr){
            if(k != null) {
                System.out.print(k + ", ");
            }
        }
    }
}
