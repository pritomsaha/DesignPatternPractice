package dp.akash.decorate_pattern2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Akash on 09-Mar-16.
 */
public class UpperCaseBufferedReader extends BufferedReader {
    public UpperCaseBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String result=super.readLine();
        return (result==null ?result:result.toUpperCase());
    }

}
