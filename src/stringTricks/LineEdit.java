/*
Создать программу, которая будет:
 -подсчитывать количество слов в предложении
 -выводить их в отсортированном виде
 -делать первую букву каждого слова заглавной.
Предложение вводится вручную. (Разделитель пробел (“ ”)).
 */
package stringTricks;

import java.io.*;
import java.util.Arrays;

public class LineEdit {
    private String userStartLine;
    private String[] userInput;

    public void decision () throws IOException {
        System.out.println(wordCount());
        sortWords();
        paragraph();
    }

    private String wordCount() throws IOException {
        userInput();
        userInput = userStartLine.split(" ");
        return userInput.length + " words in a sentence.";
    }

    private void sortWords() {
        Arrays.sort(userInput);
    }

    private void paragraph() {
        for (String s : userInput) {
            System.out.print(firstUpperCase(s) + " ");
        }
    }

    private String firstUpperCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private void userInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userStartLine = reader.readLine();
    }
}
