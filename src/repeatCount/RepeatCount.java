/*
Создать программу, которая подсчитывает сколько раз
употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
 */
package repeatCount;

import java.io.*;

public class RepeatCount {
    private String userStartText;
    private String userWord;
    private String[] userText;

    public void decision() throws IOException {
        System.out.println("Word repeat " + LFTheWord(userWord) + " time(s)");
    }

    private int LFTheWord (String inputWord) throws IOException {
        userInput();
        int count = 0;
        for (int i = 0; i < userText.length; i++) {
            if (userText[i].equalsIgnoreCase(userWord)) {
                count++;
            }
        }
        return count;
    }

    private void userInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userStartText = reader.readLine();
        userWord = reader.readLine();
        userText = userStartText.split(" ");
    }
}
