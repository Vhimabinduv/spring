package main.java;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class Student {

		private String name;
		
		private int id;

		public Student(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	
	   @RequestMapping(value="/student", method=RequestMethod.GET)
		public @ResponseBody Student getStudent() {
			return new Student("Girish", 10);
		}
	}
