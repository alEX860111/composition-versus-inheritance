package net.brainified;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleFileReaderTest {

  @Test
  public void testReadFile() {
    final SimpleFileReader reader = new SimpleFileReader();
    assertEquals("Hello World!", reader.read("src/test/resources/test.txt"));
  }

}
