package net.brainified;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ComposedCachedFileReaderTest {

  @Mock
  private FileReader readerMock;

  @InjectMocks
  private ComposedCachedFileReader reader;

  @Test
  public void testReadFile() {
    when(readerMock.read("path/to/file")).thenReturn("content");

    verifyZeroInteractions(readerMock);

    assertEquals("content", reader.read("path/to/file"));
    verify(readerMock).read("path/to/file");

    assertEquals("content", reader.read("path/to/file"));
    verifyNoMoreInteractions(readerMock);
  }

}
