package _05_middle;

public class _02 {
    //char 배열 한 개를 매개변수로 받아서 소문자는 대문자로,65<=90
    // 대문자는 소문자로 변환하는데 대문자로 변환된 값은 뒤로 하나 이동한 문자를,
    // 소문자로 변환된 값는 앞으로 하나 이동한 문자를 저장한 배열을 리턴하는 메소드를 97<=122
    // 구현하세요. 매개변수로 전달되는 char 배열에는 알파벳 대소문자만 존재합니다.
    // {'y', 'B', 'c', 'D'} 배열이 전달되면 {'Z', 'a', 'D', 'c'}가 리턴돼야 합니다.
    // 그리고 만약 'z'가  입력되면 'A'가 'a'가 입력되면 'Z' 리턴돼야 합니다
    // (알파벳 범위내에서만 이동할수 있도록).
    // 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
    // static의 위치는 접근제어자와 리턴타입 사이입니다.
    // (예시 public static void add(int a, int b) { return a + b; })

    public static char[] chraracter(char[] a) {

        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            if ('A' <= a[i] && a[i] <= 'Z') {
                if(a[i] + 31 < 'a'){
                b[i] = (char) (('a' - 1) + ('z' - (a[i] + 31)));
            } else {
                b[i] = (char) (a[i] + 31);
            }

        } else{
            if (a[i] - 31 > 'Z') {
                b[i] = (char) (('Z' - 1) + ('A' - (a[i] - 31)));
            } else {
                b[i] = (char) (a[i] - 31);
            }
        }



    }
        return b;

}

    public static void main(String[] args) {
        _02 arr = new _02();
        char[] testArr ={'z', 'Z', 'a', 'A'};
        char[] newArr = chraracter(testArr);

        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + ", ");
        }



    }


}


