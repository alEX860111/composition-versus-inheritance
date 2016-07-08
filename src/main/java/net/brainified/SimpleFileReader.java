package net.brainified;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleFileReader implements FileReader {

  @Override
  public String read(final String path) {
    try {
      return new String(Files.readAllBytes(Paths.get(path)));
    } catch (final IOException e) {
      return "";
    }
  }

}
