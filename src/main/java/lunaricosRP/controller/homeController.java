package lunaricosRP.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class homeController {

	@RequestMapping(path = "/")
	public String home() {
	return "index";
	}

}
