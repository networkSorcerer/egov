package kr.happyjob.study.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.system.model.nModel;
import kr.happyjob.study.system.service.NoticeService1;
import kr.happyjob.study.system.service.nService;

@Controller
@RequestMapping("/main/")
public class nController {
	@Autowired
	nService nservice;
	
	/*@RequestMapping("n.do")
	public String init(Model model, @RequestParam Map<String , Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		String loginID = (String) session.getAttribute("loginId");
		paramMap.put("loginID", loginID);
		
		return "system/n";
	}
	
	@RequestMapping("nList.do")
	public String getNList(Model model, @RequestParam Map<String , Object> paramMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int cpage = Integer.valueOf((String) paramMap.get("currentPage"));
		int pageSize = Integer.valueOf((String) paramMap.get("pageSize"));
		
		int startSeq = (cpage -1) * pageSize;
		
		paramMap.put("startSeq", startSeq);
		paramMap.put("pageSize", pageSize);
		
		List<nModel>nList = nservice.nList(paramMap);
		int nCnt = nservice.nListCnt(paramMap);
		
		model.addAttribute("nList", nList);
		model.addAttribute("nCnt",nCnt);
		
		return "system/nList";
	}*/
	
	@RequestMapping("nList1.do")
	@ResponseBody
	public Map<String, Object> getNList1(Model model, @RequestParam Map<String , Object> paramMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String , Object> resultMap = new HashMap<>();
	
		
		List<nModel>nList = nservice.n1List(paramMap);
		int nCnt = nservice.nListCnt(paramMap);
		
		resultMap.put("nList",nList);
		resultMap.put("nCnt", nCnt);

		
		return resultMap;
	}
	
	@RequestMapping("nSave.do")
	@ResponseBody
	public Map<String , Object> nSave (@RequestParam Map<String, Object>paramMap,
			HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		Map<String , Object> resultMap = new HashMap<String , Object>();
		String loginId = (String) session.getAttribute("loginId");
		paramMap.put("loginId", loginId);
		
		int result = 0;
		String returnMsg="";
		
		result = nservice.nSave(paramMap);
		if (result > 0) {
			returnMsg ="SUCCESS";
		} else {
			returnMsg="fail";
		}
		resultMap.put("result", returnMsg);
		return resultMap;
				
	}
	
	
	
}
