package kr.happyjob.study.product.controller;

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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.product.service.ProductService;
import kr.happyjob.study.product.vo.ProductVO;

@Controller
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	ProductService pService;
	
	private final Logger logger = LogManager.getLogger(this.getClass());

	
	@RequestMapping("product.do")
	public String product (@ModelAttribute ProductVO pvo,
			HttpServletRequest request, HttpServletResponse response, 
			@RequestParam Map<String , Object> paramMap, HttpSession session)throws Exception {
		
		 String loginID = (String) session.getAttribute("loginId");
		 paramMap.put("loginID", loginID);
		 
		return "/product/product";
	}
	
	@RequestMapping("productList.do")
	@ResponseBody
	public Map<String, Object> productList (@ModelAttribute ProductVO pvo,
			HttpServletRequest request, HttpServletResponse response, 
			@RequestParam Map<String , Object> paramMap, HttpSession session) {
		
		Map<String , Object> resultMap = new HashMap<>();
		logger.info("   - paramMap : " + paramMap);

		int cpage = Integer.valueOf((String)paramMap.get("currentPage"));
		int pageSize = Integer.valueOf((String) paramMap.get("pageSize"));
		
		int startSeq = (cpage -1)*pageSize;
		
		paramMap.put("startSeq", startSeq);
		paramMap.put("pageSize",pageSize);
		
		List<ProductVO> productList = pService.productList(paramMap);
		int productCnt = pService.productCnt(paramMap);
		
		resultMap.put("productList", productList);
		resultMap.put("productCnt",productCnt);
		return resultMap;
	}
}