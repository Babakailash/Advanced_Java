package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\BABA\\Advanced_Java\\src\\inputoutput\\bytesource.txt");
            outputStream = new FileOutputStream("C:\\Users\\BABA\\Advanced_Java\\src\\inputoutput\\bytedest.txt");

            // read a byte at a time, if it reached end of the file, return -1
            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write((byte) content);
            }
        } finally {
            if(inputStream != null){
                inputStream.close();
            }
            if(outputStream != null){
                outputStream.close();
            }
        }
    }
}
