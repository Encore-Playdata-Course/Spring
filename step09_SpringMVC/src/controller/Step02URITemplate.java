package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step02URITemplate {
	//<a href="urlTest/playdata">
	@RequestMapping("urlTest/{id}")
	public String urlTest(@PathVariable String id) {
		System.out.println("urlTest() - "+id);
		//url depth가 있는 경우 project 명 하위로 설정 시 '/'표기로 해결
//		return "redirect:/step02url.jsp"; //url 변환 확인 불기
		return "forward:/step02url.jsp";
	}
	
	//<a href="urlTest/playdata">
	@RequestMapping("urlTest2/{id}/encore/{age}")
	public String urlTest2(@PathVariable String id,@PathVariable int age) {
		System.out.println("urlTest() - "+id+ " "+ age);
		return "forward:/step02url.jsp";
	}
}
