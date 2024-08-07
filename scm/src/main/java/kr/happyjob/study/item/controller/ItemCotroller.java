package kr.happyjob.study.item.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.item.service.ItemService;
import kr.happyjob.study.item.vo.ItemVO;

@Controller
@RequestMapping("/item/")
public class ItemCotroller {
	
	@Autowired
	ItemService is;
	
	@RequestMapping("itemList1.do")
	@ResponseBody
	public Map<String , Object> itemList1 (@RequestParam Map<String , Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		
		List<ItemVO> itemList = is.itemList1(paramMap);
		resultMap.put("itemList", itemList);
		return resultMap;
	}
	
	@RequestMapping("itemList.do")
	@ResponseBody
	public Map<String , Object> itemList (@RequestParam Map<String , Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		int cpage = Integer.valueOf((String)paramMap.get("currentPage"));
		int pageSize = Integer.valueOf((String) paramMap.get("pageSize"));
		int startSeq = (cpage -1) *pageSize;
		
		paramMap.put("startSeq", startSeq);
		paramMap.put("pageSize", pageSize);
		
		List<ItemVO> itemList = is.itemList(paramMap);
		int itemCnt = is.itemCnt(paramMap);
		resultMap.put("itemList", itemList);
		resultMap.put("itemCnt", itemCnt);
		return resultMap;
	}
	
	@RequestMapping("itemDetail.do")
	@ResponseBody
	public Map<String , Object> itemDetail (@RequestParam Map<String , Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session){
	Map<String , Object> resultMap = new HashMap<>();	
	List<ItemVO> itemDetail = is.itemDetail(paramMap);
	
	resultMap.put("itemDetail", itemDetail);
	return resultMap;
	}
	
	@RequestMapping("itemModify.do")
	@ResponseBody
	public Map<String , Object> itemModify(@RequestParam Map<String , Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
	Map<String , Object> resultMap = new HashMap<>();
	int result = 0;
	String resultMsg ="";
	result = is.itemModify(paramMap);
	if (result >0 ) {
		resultMsg="SUCCESS";
	} else {
		resultMsg="FAIL";
	}
	resultMap.put("resultMsg",resultMsg );
		return resultMap;
	}
	
	@RequestMapping("item_code.do")
	@ResponseBody
	public Map<String, Object> item_code (@RequestParam Map<String , Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		Map<String , Object> resultMap = new HashMap<>();
		List<ItemVO> item_code = is.itemCode(paramMap);
		resultMap.put("item_code", item_code);
		return resultMap;
	}
}
