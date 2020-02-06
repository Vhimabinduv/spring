package bhavana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello1 {

@RequestMapping(value="respbody", method= RequestMethod.GET)
@ResponseBody
public String respBodyMethod1() {
	return "ResponseBody example";
}
}