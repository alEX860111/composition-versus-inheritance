package net.brainified;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InheritedCachedFileReaderTest {

  @Test
  public void testReadFile() {
    final InheritedCachedFileReader reader = new InheritedCachedFileReader();
    assertEquals("Hello World!", reader.read("src/test/resources/test.txt"));
    assertEquals("Hello World!", reader.read("src/test/resources/test.txt"));
  }

}
