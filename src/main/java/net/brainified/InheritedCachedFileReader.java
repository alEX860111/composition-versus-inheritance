package net.brainified;

import java.util.Map;

import com.google.common.collect.Maps;

final class InheritedCachedFileReader extends SimpleFileReader {

  private final Map<String, String> cache = Maps.newConcurrentMap();

  @Override
  public String read(final String path) {
    return cache.computeIfAbsent(path, super::read);
  }

}
