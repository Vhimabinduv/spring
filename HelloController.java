package bindu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping("/home")
    public ModelAndView hello(){ 
		return new ModelAndView("hello", "msg","Hello Spring");
    }
	/*@RequestMapping("/hello1")
    public ModelAndView hello1() {
    	System.out.println("Reached here");
    	return new ModelAndView("home", "msg", "Hello message ...");
    }*/
	
	 @RequestMapping("/hello")
	    public ModelAndView hello3(){    	
	    	return new ModelAndView("hello");
	    }
}	