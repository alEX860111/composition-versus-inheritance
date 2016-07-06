package net.brainified;

import java.util.Map;

import javax.inject.Inject;

import com.google.common.collect.Maps;

final class ComposedCachedFileReader implements FileReader {

  private final Map<String, String> cache = Maps.newConcurrentMap();

  private final FileReader reader;

  @Inject
  public ComposedCachedFileReader(final FileReader reader) {
    this.reader = reader;
  }

  @Override
  public String read(final String path) {
    return cache.computeIfAbsent(path, reader::read);
  }

}
