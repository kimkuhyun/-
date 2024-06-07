package middle;

public class _02 {
    //2. 1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
    //   단어를 bit, com, sql, int로 만들어서 모두 출력하세요
    public static void main(String[] args) {
        char[] chars = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

        String[] words = {"bit", "com", "sql", "int"};


        for (String word : words) {
            boolean isWordPossible = true;
            for (char ch : word.toCharArray()) {
                if (!contains(chars, ch)) {
                    isWordPossible = false;
                    break;
                }
            }

            if (isWordPossible) {
                System.out.println(word);
            }
        }
    }

    public static boolean contains(char[] chars, char target) {
        for (char ch : chars) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
