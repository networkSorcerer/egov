package kr.happyjob.study.cust.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.cust.service.CustService;
import kr.happyjob.study.cust.vo.CustVO;

@Controller
@RequestMapping("/cust/")
public class CustController {
	
	
	@Autowired
	CustService cService;
	
	
	  private final Logger logger = LogManager.getLogger(this.getClass());
	
	
	@GetMapping("custList.do")
	public String custList (@ModelAttribute CustVO cvo, Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		List<CustVO> cList = cService.custList(paramMap);
		List<CustVO> custList = cService.customerList(paramMap);
		model.addAttribute("cList", cList);
		model.addAttribute("custList",custList );
		 logger.info("cList: " + cList);

		return "login/login";
	}
	
	@RequestMapping("custList1.do")
	@ResponseBody
	public Map<String, Object> custList1 (@ModelAttribute CustVO cvo, Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		Map<String , Object> resultMap = new HashMap<>();
		List<CustVO> custList = cService.customerList(paramMap);
		resultMap.put("custList", custList);

		return resultMap;
	}
	
	@RequestMapping("custDetail.do")
	@ResponseBody
	public Map<String , Object> custDetail (@ModelAttribute CustVO cvo, Model model, @RequestParam Map<String, Object>paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		List<CustVO> custDetail = cService.cDetail(paramMap);
		resultMap.put("custDetail",custDetail );
		
		return resultMap;
	}
	@RequestMapping("custModify.do")
	@ResponseBody
	public Map<String, Object>  custModify (@ModelAttribute CustVO cvo, Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		
		int result = 0;
		String resultMsg="";
		result = cService.custModify(paramMap);
		if(result >0){
			resultMsg="SUCCESS";
		}else {
			resultMsg="fail";
		}
		resultMap.put("resultMsg", resultMsg);
		return resultMap;
	}
	
	@RequestMapping("custInsert.do")
	@ResponseBody
	public Map<String, Object> custInsert (@RequestParam Map<String, Object> paramMap, 
			HttpServletRequest resquest, HttpServletResponse response, HttpSession session) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		int result = 0;
		String resultMsg="";
		
		result = cService.custInsert(paramMap);
		if(result >0) {
			resultMsg="SUCCESS";
		}else {
			resultMsg="FAIL";
		}
		resultMap.put("resultMsg", resultMsg);
		return resultMap;
	}
	
	@RequestMapping("custDelete.do")
	@ResponseBody
	public Map<String, Object> custDelete(@RequestParam Map<String , Object> paramMap, 
			HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{
		Map<String , Object> resultMap = new HashMap<String, Object>();
		
		int result = 0;
		String resultMsg="";
		
		result = cService.custDel(paramMap);
		if(result>0) {
			resultMsg="SUCCESS";
		}else {
			resultMsg="FAIL";
		}
		resultMap.put("resultMsg", resultMsg);
		return resultMap;
	}
	
	@RequestMapping("CustSave.do")
	@ResponseBody
	public Map<String , Object> custSave  (@RequestParam Map<String, Object> paramMap,
		    HttpServletRequest request, HttpServletResponse response,  HttpSession session) throws Exception{
		 Map<String , Object > resultMap = new HashMap<String, Object>();

		
		int result = 0;
		String resultMsg="";
		
		 result = cService.custSave(paramMap);
		  if(result > 0) {
			  resultMsg = "SUCCESS";
		  } else {
			  resultMsg = "fail";
		  }
		  
		  resultMap.put("resultMsg", resultMsg);
		  return resultMap;
		
	}
	
	
}
