package org.example;

import java.io.IOException;

public interface Transformable {
      void transform(String fileIn, String fileOut) throws IOException;
}
