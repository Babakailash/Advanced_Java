package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader readerStream = null;
        FileWriter writerStream = null;
        try {
            readerStream = new FileReader("C:\\Users\\BABA\\Advanced_Java\\src\\inputoutput\\charsource.txt");
            writerStream = new FileWriter("C:\\Users\\BABA\\Advanced_Java\\src\\inputoutput\\chardest.txt");

            //Reading source file and writing content to target file character
            int content;
            while ((content = readerStream.read()) != -1) {
                writerStream.append((char) content);
            }
        } finally {
            if (readerStream != null) {
                readerStream.close();
            }
            if (writerStream != null) {
                writerStream.close();
            }
        }
    }
}
