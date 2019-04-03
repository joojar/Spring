package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class My 
{
	@RequestMapping("/say")
	public ModelAndView index(){
		return new ModelAndView("sayHello");
	}
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("welcome", "message", message);
	}

  
}
