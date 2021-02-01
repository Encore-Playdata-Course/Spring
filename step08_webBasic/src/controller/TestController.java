package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//MVC pattern ����� controller Ŭ������ �����ϴ� ����
//url��û �ް�, jsp ���� �� ���̷�Ʈ�� client �������� ����
//servlet �� ���� ���� ����
//servlet - HttpServlet ����ʼ�
//spring ����� @Controller �ֳ����̼Ǹ����� �Ϲ� servlet ó�� ���� ����
@Controller
public class TestController {
	
	//url ���� - http://ip:80/step08_webBasic/one
	@RequestMapping(value="one", method=RequestMethod.GET)
	public ModelAndView m1() {
		System.out.println("m1() ------------");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("key","data"); //������ ����(model����)
		mv.setViewName("finalView");//jsp �� ���� view ����
		
		return mv; //forward ������� �̵�
	}
	
	@RequestMapping(value="two")
	public String m2() {
		System.out.println("m2() ------------");
		return "redirect:view.jsp"; //redirect ������� �̵�
	}
}