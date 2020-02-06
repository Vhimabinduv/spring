package bindu1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Javacontroller {
	
   @RequestMapping("/hello")
   ModelAndView hello(){	   
	   return new ModelAndView("hello", "msg", "Hello Spring MVC ..");
   }
}




