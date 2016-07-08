package net.brainified.inheritance;

import java.util.Map;

import com.google.common.collect.Maps;

import net.brainified.SimpleFileReader;

final class CachedFileReader extends SimpleFileReader {

  private final Map<String, String> cache = Maps.newConcurrentMap();

  @Override
  public String read(final String path) {
    return cache.computeIfAbsent(path, super::read);
  }

}
