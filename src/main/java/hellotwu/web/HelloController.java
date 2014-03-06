package hellotwu.web;

import hellotwu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

	@RequestMapping(method = RequestMethod.GET)
	public String displayMessage(ModelMap model) {
        model.addAttribute("message", helloService.getGreeting());
		return "hello";
	}
}