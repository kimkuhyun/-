package _240518_주말보충;

import java.io.*;

public class _03 {
    //주어진 텍스트 파일에서 특정 단어가 몇 번 나타나는지 계산하고 출력하는 프로그램을 작성하십시오.
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        File file = new File(userDir+"src/_240518_주말보충/bookList.txt");
        String filePath = file.getAbsolutePath();
        String targetWord = "J";
        int count  = countWord(filePath, targetWord);
        System.out.println(targetWord+"는(은) 총 "+count+"번 나왔습니다.");
    }

    public static int countWord(String filePath, String targetWord) {
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) !=null){
                String[] words = line.split(" \\s");
                for(String word : words){
                    if(word.equalsIgnoreCase(targetWord)){
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e){
            System.err.println("파일을 찾을 수 없습니다: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
