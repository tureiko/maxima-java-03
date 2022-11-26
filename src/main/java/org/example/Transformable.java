package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Transformable {
     default void transform(String fileIn, String fileOut) throws IOException {

    }
}
