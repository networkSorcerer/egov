package kr.happyjob.study.work.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//담당업무 사이드바
@Controller
@RequestMapping("/work/")
public class WorkController {
	
	   // Set logger
	   private final Logger logger = LogManager.getLogger(this.getClass());

	   // Get class name for logger
	   private final String className = this.getClass().toString();

	
	//담당업무(구매담당자) => 발주현황
	@RequestMapping("orderChk.do")//url똑같이했음 페이지랑
	public String directionOrder(){
		logger.info("담당업무 사이드바 : 발주현황 컨트롤러 " + className);

		return "work/orderCheck";
	}
	
	//담당업무(구매담당자) => 반품현황
	@RequestMapping("returnChk.do")//url똑같이했음 페이지랑
	public String direction(){
		logger.info("담당업무 사이드바 : 반품현황 컨트롤러 " + className);

		
		return "work/returnCheck";
	}
	
	//담당업무(배송담당자) => 배송현황
	@RequestMapping("deliveryChk.do")//url똑같이했음 페이지랑
	public String directionDelivery(){
		logger.info("담당업무 사이드바 : 배송현황 컨트롤러 " + className);

		
		return "work/deliveryCheck";
	}

}
