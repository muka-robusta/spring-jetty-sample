package com.onetwostory.simplejettyanalyticssample.config;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

public class ServerConfiguration {

  @Bean
  public ConfigurableServletWebServerFactory webServerFactory() {
    JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
    factory.setPort(9000);
    factory.setContextPath("/file-api");
    //factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
    return factory;

  }

}
