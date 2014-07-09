package com.sohu.scx;

import java.io.IOException;

import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping(value="app")
public class App {
  Logger LOG = Logger.getLogger("APP");
  @RequestMapping(value="test.jhtml")
   public void test(HttpServletResponse response, HttpServletRequest request){
      
      LOG.info("TEST : TEST");
      
      try {
        response.getWriter().print("test");
        response.getWriter().flush();
        response.getWriter().close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      
      
   }
}
