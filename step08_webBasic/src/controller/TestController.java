package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//MVC pattern 기반의 controller 클래스를 구현하는 선언
//url요청 받고, jsp 지정 및 다이렉트로 client 브라우저에 응답
//servlet 과 같은 구현 내용
//servlet - HttpServlet 상속필수
//spring 기반의 @Controller 애노테이션만으로 일반 servlet 처럼 개발 가능
@Controller
public class TestController {
	
	//url 설정 - http://ip:80/step08_webBasic/one
	@RequestMapping(value="one", method=RequestMethod.GET)
	public ModelAndView m1() {
		System.out.println("m1() ------------");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("key","data"); //데이터 저장(model저장)
		mv.setViewName("finalView");//jsp 즉 실행 view 지정
		
		return mv; //forward 방식으로 이동
	}
	
	@RequestMapping(value="two")
	public String m2() {
		System.out.println("m2() ------------");
		return "redirect:view.jsp"; //redirect 방식으로 이동
	}
}
