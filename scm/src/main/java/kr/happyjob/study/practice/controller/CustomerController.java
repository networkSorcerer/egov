package kr.happyjob.study.practice.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.happyjob.study.practice.service.CustomerService;
import kr.happyjob.study.practice.vo.CustomerVO;

@Controller
@RequestMapping("/system/")
public class CustomerController {
	
	@Autowired
	private CustomerService cService;
	
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	
	@RequestMapping("notice.do")
	public String init (Model model, @RequestParam Map<String , Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session)throws Exception {
		String loginID = (String) session.getAttribute("loginId");
		paramMap.put("loginID", loginID);
		
		return "system/customer";
	}
	
	@RequestMapping("customerList.do")
	public String getCustomerList(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		logger.info("+ Start " + className + ".getNoticeList");
		logger.info("   - paramMap : " + paramMap);

		/*int cpage = Integer.valueOf((String) paramMap.get("currentPage"));
		int pageSize = Integer.valueOf((String) paramMap.get("pageSize"));

		int startSeq = (cpage - 1) * pageSize;

		paramMap.put("startSeq", startSeq);
		paramMap.put("pageSize", pageSize);*/

		List<CustomerVO> cList = cService.customerList(paramMap);
		int cCnt = cService.customerCnt(paramMap);

		model.addAttribute("cList", cList);
		model.addAttribute("cCnt", cCnt);

		return "system/customerList";	
	}

}
