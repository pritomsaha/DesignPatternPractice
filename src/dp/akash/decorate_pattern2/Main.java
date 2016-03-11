package dp.akash.decorate_pattern2;

import java.io.*;

/**
 * Created by Akash on 09-Mar-16.
 */
public class Main {
    public static void main(String[] args){
        int c;
        try {
            InputStream inputStream=new LowerCaseBufferInputStream(new FileInputStream("input.txt"));
            while ((c=inputStream.read())>=0){
                System.out.print((char) c);
            }
            System.out.println("\n");
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line;
        try {
            BufferedReader reader=new UpperCaseBufferedReader(new FileReader(new File("input.txt")));
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

