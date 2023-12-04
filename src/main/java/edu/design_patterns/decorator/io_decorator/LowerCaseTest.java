package edu.design_patterns.decorator.io_decorator;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

public class LowerCaseTest {
    public static void main(String[] args) {
        try {
            InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
                    "src/main/resources/text_for_lower_case_decorator.txt")));
            is.mark(1);

            List<Byte> b1 = new ArrayList<>();
            int c;
            while ((c = is.read()) > -1) {
                b1.add((byte) c);
            }
            b1.forEach(a -> System.out.print((char) a.byteValue()));

            is.reset();

            byte[] b2 = new byte[b1.size()];
            int read = is.read(b2, 0, b2.length);
            System.out.println("\n\nRead bytes: " + read);

            for (byte value : b2) {
                System.out.print((char) value);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
