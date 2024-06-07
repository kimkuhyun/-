package _240505_주말보충;

import java.util.HashSet;

public class _07_ForAndWhile {
    //주어진 문자열의 모든 순열 생성하기---????????????

    public static void main(String[] args) {
        String input = "abc";
        HashSet<String> permutations = generatePermutations(input);
        System.out.println("주어진 문자열의 순열: " + permutations);
    }

    // 주어진 문자열의 모든 순열을 생성하는 메서드
    public static HashSet<String> generatePermutations(String input) {
        HashSet<String> permutations = new HashSet<>();
        generatePermutationsHelper(input.toCharArray(), 0, permutations);
        return permutations;
    }

    // 재귀적으로 순열을 생성하는 도우미 메서드
    private static void generatePermutationsHelper(char[] chars, int index, HashSet<String> permutations) {
        // 배열의 끝에 도달하면 순열을 HashSet에 추가
        if (index == chars.length - 1) {
            permutations.add(String.valueOf(chars));
            return;
        }
        // 현재 인덱스부터 배열의 끝까지 반복하여 순열 생성
        for (int i = index; i < chars.length; i++) {
            // 현재 인덱스와 i 인덱스의 문자 교환
            swap(chars, index, i);
            // 다음 인덱스로 이동하여 재귀적으로 순열 생성
            generatePermutationsHelper(chars, index + 1, permutations);
            // 되돌리기 위해 다시 교환
            swap(chars, index, i);
        }
    }

    // 두 문자의 위치를 바꾸는 메서드
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

