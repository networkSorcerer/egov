package kr.happyjob.study.responsibilities.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.responsibilities.service.ReturnService;
import kr.happyjob.study.responsibilities.vo.ReturnVO;

@RequestMapping("/work/")
@Controller
public class ReturnController {
	
	
	@Autowired
	ReturnService rService;
	
	@RequestMapping("returnChk.do")//return은 예약어여서 쓸수 없음
	public String returnCheck(@ModelAttribute ReturnVO rvo, HttpServletResponse response, HttpServletRequest request,
	                          @RequestParam Map<String, Object> paramMap, HttpSession session) {
	    String loginID = (String) session.getAttribute("loginId");
	    paramMap.put("loginID", loginID);

	    return "/work/Return"; 
	}

	
	@RequestMapping("returnList.do")
	@ResponseBody
	public Map<String , Object> returnList (@ModelAttribute ReturnVO rvo, HttpServletResponse response,
			@RequestParam Map<String, Object> paramMap  ) throws Exception{
		Map<String , Object> resultMap = new HashMap<>();
		
		List<ReturnVO> returnList = rService.returnList(paramMap);
		resultMap.put("returnList", returnList);
		
		return resultMap;
	}
	
	@RequestMapping("returnDetail.do")
	@ResponseBody
	public Map<String , Object> returnDetail (@ModelAttribute ReturnVO rvo, HttpServletResponse response, HttpServletRequest request,
            @RequestParam Map<String, Object> paramMap, HttpSession session) throws Exception{
		Map<String , Object> resultMap = new HashMap<>();
		
		List<ReturnVO> returnDetail = rService.returnDetail(paramMap);
		
		resultMap.put("returnDetail", returnDetail);
		
		return resultMap;
	}
	
	@RequestMapping("confirm.do")
	@ResponseBody
	public Map<String , Object> confirm (@ModelAttribute ReturnVO rvo, HttpServletResponse response, HttpServletRequest request,
            @RequestParam Map<String, Object> paramMap, HttpSession session)throws Exception{
		Map<String , Object> resultMap = new HashMap<>();
		
		int result =0;
		String resultMsg="";
		
		result= rService.confirm(paramMap);
		if(result > 0 ) {
			resultMsg="SUCCESS";
		}else {
			resultMsg="FAIL";
		}
		resultMap.put("resultMsg", resultMsg);
		return resultMap;
	}
	
	@RequestMapping("modItemCount.do")
	@ResponseBody
	public Map<String , Object> modItemCount (@ModelAttribute ReturnVO rvo, HttpServletResponse response, HttpServletRequest request,
            @RequestParam Map<String, Object> paramMap, HttpSession session)throws Exception{
		Map<String , Object> resultMap = new HashMap<>();
		
		int result =0;
		String resultMsg="";
		
		result= rService.modeItemCount(paramMap);
		if(result > 0 ) {
			resultMsg="SUCCESS";
		}else {
			resultMsg="FAIL";
		}
		resultMap.put("resultMsg", resultMsg);
		return resultMap;
	}
	
}
