package com.onetwostory.simplejettyanalyticssample.manager;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class DataChunkGenerationManager {

  public byte[] generateFixedSizeDataChunk(int size) {
    byte[] fixedSizeByteArray = new byte[size];
    new Random().nextBytes(fixedSizeByteArray);
    return fixedSizeByteArray;
  }

}
