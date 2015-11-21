package br.com.uaijug.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(name="/hello")
	public String getMessage() {
		return "Hello World!";
	}
}
