package org.lunapark.dev.tablet;

import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        System.out.println("tester");
        Reader reader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };


    }
}
