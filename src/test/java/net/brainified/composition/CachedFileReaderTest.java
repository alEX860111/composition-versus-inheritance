package net.brainified.composition;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import net.brainified.FileReader;

@RunWith(MockitoJUnitRunner.class)
public class CachedFileReaderTest {

  @Mock
  private FileReader readerMock;

  @InjectMocks
  private CachedFileReader reader;

  @Test
  public void testReadFile() {
    when(readerMock.read("path/to/file")).thenReturn("content");

    assertEquals("content", reader.read("path/to/file"));
    verify(readerMock).read("path/to/file");

    assertEquals("content", reader.read("path/to/file"));
    verifyNoMoreInteractions(readerMock);
  }

}
