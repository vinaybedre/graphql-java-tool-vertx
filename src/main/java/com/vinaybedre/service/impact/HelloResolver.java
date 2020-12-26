package com.vinaybedre.service.impact;

import com.vinaybedre.service.impact.model.HelloQueryResolver;

public class HelloResolver implements HelloQueryResolver {
  @Override
  public Integer hello() throws Exception {
    return 1;
  }
}
