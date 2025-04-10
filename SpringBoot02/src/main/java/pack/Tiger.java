package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class Tiger  {
	@GetMapping("/")
	public String f0() {
		System.out.println("f0컨트롤러");
		return "index";
	}
	@GetMapping("/t1")
	public String f1() {
		System.out.println("f1컨트롤러");
		return "Tigerview";
	}
	@GetMapping("/t2")
	public String f2() {
		System.out.println("f2컨트롤러");
		return "Tigerview";
	}
}