package com.gura.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//컨트롤러로 만들기 위한 어노테이션
@Controller
public class HomeController {
	
	//"/home.do" 요청처리
	@RequestMapping("/home") // 클라이언트의 요청 맵핑하기 위한 어노테이션
	public String home() {
		//메소드 명은 마음대로 쓸 수 있다.
		//리턴되는 data type과 메소드명은 상황에 맞게 구성할 수 있다.
		// - 리턴 type을 String으로 한다는 것의 의미
		//   단, @ResponseBody 어노테이션이 없다는 가정하에서.
		// 1. forward 이동 정보를 리턴해준다.
		// 2. redirect 이동정보를 리턴해준다.   요청 다시 해 이러면서 요청할 경로를 주는 것.
		//    클라이언트에게 보낸 경로로 응답을 강요한다.  이것 자체가 응답임.
		
		//    redirect로 이동하려면
		//   "redirect:요청경로" 이렇게 작성하면 된다.
		//--- return "redirect:/home.do"; ---
		//    context는 저절로 붙어 들어간다.
		
		
		return "home";
		//이것의 의미는 /WEB-INF/views/home.jsp 로 응답을 보내겠다는 것.
		//servlet context.xml에 명시해놓았기 때문에 이렇게 알아들을 수 있다.
	}
	
}
