package basic;

public class _02 {
    public static void main(String[] args) {
        //2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
        //    비어있는 바이트의 공간을 a로 모두 채우시오.

        StringBuffer sb = new StringBuffer(30);

        sb.append("hello");

        int remain = sb.capacity() - sb.length();

        for (int i = 0; i < remain; i++) {
            sb.append('a');
        }

        System.out.println(sb);
    }
}
