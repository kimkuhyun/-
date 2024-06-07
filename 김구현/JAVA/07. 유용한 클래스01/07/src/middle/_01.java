package middle;

public class _01 {
    public static void main(String[] args) {
        //1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
        //    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.

        StringBuffer sb = new StringBuffer(30);

        sb.append("hello");

        String s = "bit";

        int re = (sb.capacity() - sb.length()) / s.length();

        for(int i = 0; i < re; i++){
            sb.append(s);
        }

        System.out.println(sb+"b");











    }
}
