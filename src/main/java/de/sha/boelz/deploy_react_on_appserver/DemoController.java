package de.sha.boelz.deploy_react_on_appserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
