package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import model.domain.Customer;

@Controller
public class Step01Controller {

	//	<a href="hello1"> -> controller -> step01RedirectView.jsp
	@RequestMapping("hello1")
	public String m1() {
		 System.out.println("m1()");
		 return "redirect:step01RedirectView.jsp";
	}
	
	//<a href="hello2">
	@RequestMapping("hello2")
	public ModelAndView m2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("newData","김민건");
		mv.setViewName("step01hello2");
		return mv; //forward 방식으로 jsp
	}
	
	//<a href="hello3">
	@RequestMapping("hello3")
	public String m3() throws Exception{
		System.out.println("m3()");
		if(true) {
			throw new Exception("예외 처리 학습");
		}
		return null;
	}
	
	//예외 전담 처리 메소드 - exception handling 메소드
	//예외 타입 설정 - Exception 타입으로 test
	@ExceptionHandler
	public String handler(Exception e) {
		System.out.println("handler()");
		System.out.println(e.getMessage());
		return "redirect:failView.jsp";
	}
	
	//redirect 로 웹페이지 이동 시에도 parameter 값 적용 가능한 기술
	//<a href="hello4">
	@RequestMapping("hello4")
	public String m4(RedirectAttributes attr) {
		System.out.println("m4()");
		
		//web querystring 구성과 동일
		//request.getParameter("newData") or ${param.newData}
		attr.addAttribute("newData","redirect data");
		
		//step01hello4.jsp?newData=redirect data
		return "redirect:step01hello4.jsp";
	}
	
	/* @RequestParam("id") String id 동일
	 * 
	 * 
	 * @RequestParam("age") int age
	 * 	int age = Integer.parseInt(request.getParameter("age"))
	 * 
	 * 결론 : request 객체 내에 저장된 web query String
	 */
	//<a href="hello5?id=tester&age=10">
	@RequestMapping("hello5")
	public ModelAndView m5(@RequestParam("id") String id) {
		System.out.println("m5() - "+id+" ");
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("newData","m5()save"); //request.setAttribute()
		mv.setViewName("step01hello5");
		return mv; //request 객체가 유지되면서 화면이동
		
	}
	
	/* controller의 메소드 parameter로 dto선언 시
	 * -client라 전송하는 web query string key와 일치되는 변수들을 보유한 DTO인 경우
	 * 자동 생성
	 * - ?id=tester&age=100 => Customer에도 id와 age 변수와 setXxx()가 필수
	 */
	//<a href="hello6?id=tester&age=100">
	@RequestMapping("hello6")
	public String m6(Customer cust) {
		System.out.println("m6()" + cust.getId());
		
		//forward 방식으로 viewResolver를 통해서 웹페이지 이동
		return "step01hello6"; //forward, WEB-INF/view/step01hello6.jsp 방식으로 이동
	}
	
	/* Model
	 * 1. 이름처럼 데이터 표현용 API
	 * 2. org.springframework.ui.Model package명에서 짐작
	 * 	- 화면 처리 단에서 사용된 데이터 활용 API
	 */
	//<a href="hello7?id=tester&age=100">
	@RequestMapping("hello7")
	public String m7(Model model) {
		System.out.println("m7()");
		//request.setAttribute("newData","playdata"); 동일
		model.addAttribute("newData","playdata");
		return "step01hello7";
	}
	
	/* @ModelAttribute("cust") Customer c
	 * Customer 객체 생성 :
	 *  Customer c = new Customer(request.getParameter("id"),Integer.parseInt(request.getParameter("age"))
	 *  request.setAttribute("cust", c)
	 */
	//<a href="hello8?id=tester&age=70">
	@RequestMapping("hello8")
	public String m8(@ModelAttribute("cust") Customer c) {
		System.out.println("m8() "+ c.getId());
		return "step01hello8";
	}

}