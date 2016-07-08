package net.brainified.inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CachedFileReaderTest {

  @Test
  public void testReadFile() {
    final CachedFileReader reader = new CachedFileReader();
    assertEquals("Hello World!", reader.read("src/test/resources/test.txt"));
  }

}
