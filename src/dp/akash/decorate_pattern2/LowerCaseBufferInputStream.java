package dp.akash.decorate_pattern2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Akash on 09-Mar-16.
 */
public class LowerCaseBufferInputStream extends BufferedInputStream{

    public LowerCaseBufferInputStream(InputStream in) {
        super(in);
    }

    @Override
    public synchronized int read() throws IOException {
        int c=super.read();
        return (c==-1? c:Character.toLowerCase((char) c));
    }

    @Override
    public synchronized int read(byte[] b, int off, int len) throws IOException {
        int result= super.read(b, off, len);
        for(int i=off;i<off+result;i++){
            b[i]=(byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
