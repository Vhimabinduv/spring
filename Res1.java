package bindu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Res1 {
	@RequestMapping(value="/method7/{id}")
	@ResponseBody
	public String method7(@PathVariable("id") int id){
	    return "method7 with id="+id;
	}
}