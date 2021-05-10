package com.onetwostory.simplejettyanalyticssample.controller;

import com.onetwostory.simplejettyanalyticssample.manager.DataChunkGenerationManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServerController {

  private final DataChunkGenerationManager dataChunkGenerationManager;

  @GetMapping(value = "/{returnFileSize}", produces = "text/plain")
  public @ResponseBody byte[] processRequestWithFixedSizeByteArray(
      @PathVariable int returnFileSize) {

    try { Thread.sleep(100); }
    catch(InterruptedException ex) { ex.printStackTrace(); }

    return dataChunkGenerationManager.generateFixedSizeDataChunk(returnFileSize);

  }
}
