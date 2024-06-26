package kr.happyjob.study.adm.controller;

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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import kr.happyjob.study.adm.model.PeopleMngModel;
import kr.happyjob.study.adm.service.PeopleMngService;


@Controller
@RequestMapping("/adm/")
public class PeopleMngController {
	
	@Autowired
	PeopleMngService peopleMngService;
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();

	// 학생 관리	
	@RequestMapping("studentControl.do")
	public String tutor_lec_list(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		
		// 강의 리스트 가져오기
		List<PeopleMngModel> list_lec = peopleMngService.lec_list(paramMap);
		model.addAttribute("list_lec", list_lec);
		logger.info("lec_list:" + list_lec);
		
		return "adm/studentMng";
	}

	/* 강의 리스트 */
	@RequestMapping("plist_lec.do")
	public String lec_list(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
 
		int currentPage = Integer.parseInt((String) paramMap.get("currentPage")); // 현재
		int pageSize = Integer.parseInt((String) paramMap.get("pageSize")); // 페이지
		int pageIndex = (currentPage - 1) * pageSize;
		String searchWord_lec = (String) paramMap.get("searchWord_lec");
		logger.info("+ Start " + className + ".plist_lec");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		paramMap.put("searchWord_lec", searchWord_lec);

		logger.info("   - putparamMap : " + paramMap);

		// 강의 리스트 가져오기
		List<PeopleMngModel> list_lec = peopleMngService.lec_list(paramMap);
		model.addAttribute("list_lec", list_lec);
		logger.info("lec_list:" + list_lec);

		// 강의 목록 카운트 조회
		int totalCount = peopleMngService.countList_lec(paramMap);
		model.addAttribute("totalCnt_lec", totalCount);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("currentPage_lec", currentPage);

		logger.info("   - totalCnt : " + totalCount);
		logger.info("   - pageSize : " + pageSize);
		logger.info("   - currentPage : " + currentPage);

		logger.info("+ End " + className + ".plist_lec");

		return "adm/lecList";
	}
	
	/* 강의 리스트 */
	@RequestMapping("plist_lec_json.do")
	@ResponseBody
	public Map<String, Object> lec_list_json(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
 
		int pageSize = Integer.parseInt((String) paramMap.get("pageSize")); // 페이지
		int currentPage = Integer.parseInt((String) paramMap.get("currentPage")); // 현재
		int pageIndex = (currentPage - 1) * pageSize;
		String searchWord_lec = (String) paramMap.get("searchWord_lec");
		logger.info("+ Start " + className + ".plist_lec");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		paramMap.put("searchWord_lec", searchWord_lec);

		logger.info("   - putparamMap : " + paramMap);

		// 강의 리스트 가져오기
		List<PeopleMngModel> list_lec = peopleMngService.lec_list(paramMap);
//		model.addAttribute("list_lec", list_lec);
		logger.info("lec_list:" + list_lec);

		// 강의 목록 카운트 조회
		int totalCount = peopleMngService.countList_lec(paramMap);
//		model.addAttribute("totalCnt_lec", totalCount);
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("currentPage_lec", currentPage);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("list_lec", list_lec);
		resultMap.put("totalCnt_lec", totalCount);
		resultMap.put("pageSize", pageSize);
		resultMap.put("currentPage_lec", currentPage);

		logger.info("   - totalCnt : " + totalCount);
		logger.info("   - pageSize : " + pageSize);
		logger.info("   - currentPage : " + currentPage);

		logger.info("+ End " + className + ".plist_lec");

		return resultMap;
	}

	/* 학생 리스트 */
	@RequestMapping("list_std_json.do")
	@ResponseBody
	public Map<String, Object> std_list_json(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		logger.info("   - paramMap : " + paramMap);

		String searchKey_std = (String) paramMap.get("searchKey_std");
		String searchWord_std = (String) paramMap.get("searchWord_std");
		int currentPage_std = Integer.parseInt((String) paramMap.get("currentPage_std")); // 현재
		
		logger.info("   - currentPage_std : " + currentPage_std);																			// 페이지
																					// 번호
		int pageSize_std = Integer.parseInt((String) paramMap.get("pageSize_std")); // 페이지																	// 사이즈
		int pageIndex_std = (currentPage_std - 1) * pageSize_std;
		
		logger.info("   - pageIndex_std : " + currentPage_std);	
		logger.info("+ Start " + className + ".list_std");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex_std", pageIndex_std);
		paramMap.put("pageSize_std", pageSize_std);
		paramMap.put("searchWord_std", searchWord_std);

		// 학생 목록 조회
		List<PeopleMngModel> list_std = peopleMngService.std_list(paramMap);
		//model.addAttribute("list_std", list_std);
		logger.info("   - list_std : " + list_std);

		// 학생 목록 카운트 조회
		int totalCount= peopleMngService.countList_std(paramMap);
	
//		model.addAttribute("totalCnt_std", totalCount);
//		model.addAttribute("pageSize_std", pageSize_std);
//		model.addAttribute("currentPage_std", currentPage_std);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("list_std", list_std);
		resultMap.put("totalCnt_std", totalCount);
		resultMap.put("pageSize_std", pageSize_std);
		resultMap.put("currentPage_std", currentPage_std);
		
		logger.info("   - totalCnt : " + totalCount);
		logger.info("   - pageSize : " + pageSize_std);
		logger.info("   - currentPage : " + currentPage_std);

		logger.info("+ End " + className + ".list_std");
		
		return resultMap;
	}
	
	/* 학생 리스트 */
	@RequestMapping("list_std.do")
	public String std_list(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		logger.info("   - paramMap : " + paramMap);

		String searchKey_std = (String) paramMap.get("searchKey_std");
		String searchWord_std = (String) paramMap.get("searchWord_std");
		int currentPage_std = Integer.parseInt((String) paramMap.get("currentPage_std")); // 현재
		
		logger.info("   - currentPage_std : " + currentPage_std);																			// 페이지
																					// 번호
		int pageSize_std = Integer.parseInt((String) paramMap.get("pageSize_std")); // 페이지																	// 사이즈
		int pageIndex_std = (currentPage_std - 1) * pageSize_std;
		
		logger.info("   - pageIndex_std : " + currentPage_std);	
		logger.info("+ Start " + className + ".list_std");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex_std", pageIndex_std);
		paramMap.put("pageSize_std", pageSize_std);
		paramMap.put("searchWord_std", searchWord_std);

		// 학생 목록 조회
		List<PeopleMngModel> list_std = peopleMngService.std_list(paramMap);
		model.addAttribute("list_std", list_std);
		logger.info("   - list_std : " + list_std);

		// 학생 목록 카운트 조회
		int totalCount= peopleMngService.countList_std(paramMap);
	
		model.addAttribute("totalCnt_std", totalCount);
		model.addAttribute("pageSize_std", pageSize_std);
		model.addAttribute("currentPage_std", currentPage_std);

		logger.info("   - totalCnt : " + totalCount);
		logger.info("   - pageSize : " + pageSize_std);
		logger.info("   - currentPage : " + currentPage_std);

		logger.info("+ End " + className + ".list_std");
		
		return "adm/stdList";
	}
	
	// 학생 정보 단건 조회
	@RequestMapping("user_info.do")
	@ResponseBody
	public Map<String, Object> select_adv (Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".user_info");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "조회 되었습니다.";
		
		PeopleMngModel user_model = peopleMngService.user_info(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		resultMap.put("user_model", user_model);
		
		logger.info("+ End " + className + ".user_info");
		
		return resultMap;
	}
	
	//학생 강의 수강정보 리스트
	@RequestMapping("slist_lec_json.do")
	@ResponseBody // JSON 형식으로 응답을 반환하기 위함
	public Map<String, Object> slec_list_json(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
	        HttpServletResponse response, HttpSession session) throws Exception {
	    
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    logger.info("   - putparamMap : " + paramMap);

	    String user_type = (String) paramMap.get("user_type");

	    if (user_type == null) {
	    	List<PeopleMngModel> list_tut = peopleMngService.tut_list(paramMap);
	    	resultMap.put("list_tut", list_tut);
			logger.info("   - list_tut : " + list_tut);

	        return resultMap;
	    }
	    // 상세정보창 강의목록 가져오기
	    if (user_type.equals("b") || user_type.equals("e")) { // 강사
	        List<PeopleMngModel> tlist_lec = peopleMngService.tlec_list(paramMap);
	        resultMap.put("tlist_lec", tlist_lec);
	        logger.info("tlec_list: " + tlist_lec);
	    } else if (user_type.equals("a")) { // 학생
	        List<PeopleMngModel> slist_lec = peopleMngService.std_lec_info(paramMap);
	        resultMap.put("slist_lec", slist_lec);
	        logger.info("slec_list: " + slist_lec);
	    }
	    else  {
	        logger.warn("Invalid user_type: " + user_type);
	        resultMap.put("error", "Invalid user_type: " + user_type);
	    } 
	    

	    return resultMap;
	}

	
	//학생 강의 수강정보 리스트
		@RequestMapping("slist_lec.do")
		@ResponseBody
		public String slec_list(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
				HttpServletResponse response, HttpSession session) throws Exception {
			
			String user_type=(String) paramMap.get("user_type");
			
			logger.info("   - putparamMap : " + paramMap);

			// 상세정보창 강의목록 가져오기
			if(user_type.equals("b")){ //강사
				List<PeopleMngModel> tlist_lec = peopleMngService.tlec_list(paramMap);
				model.addAttribute("tlist_lec", tlist_lec);
				logger.info("tlec_list:" + tlist_lec);
				int tut_lec_count = peopleMngService.tut_lec_count(paramMap);
				model.addAttribute("tut_lec_count", tut_lec_count);
				logger.info("tut_lec_count:" + tut_lec_count);
				return "adm/tutLecList";
				
			}else if(user_type.equals("a")){ //학생
				List<PeopleMngModel> slist_lec = peopleMngService.std_lec_info(paramMap);
				model.addAttribute("slist_lec", slist_lec);
				logger.info("slec_list:" + slist_lec);
				//강의 숫자 조회
				int std_lec_count = peopleMngService.std_lec_count(paramMap);
				model.addAttribute("std_lec_count", std_lec_count);
				logger.info("std_lec_count:" + std_lec_count);
				return "adm/stdLecList";
				
			}
					
			return "list_std.do";
		}
	
	//유저 정지
	@RequestMapping("ban_user.do")
	@ResponseBody
	public Map<String, Object> deleteComnDtlCod(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".ban_user");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "회원 탈퇴 되었습니다.";
		
		peopleMngService.ban_user(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".ban_user");
		
		return resultMap;
	}
	
	// 학생 수강 신청
	@RequestMapping("std_lec_reg.do")
	@ResponseBody
	public Map<String, Object> std_lec_reg(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".std_lec_reg");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "수강 신청 되었습니다.";
		
		peopleMngService.std_lec_reg(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".std_lec_reg");
		
		return resultMap;
	}
	
	// 학생 수강 신청 취소
	@RequestMapping("std_lec_del.do")
	@ResponseBody
	public Map<String, Object> std_lec_del(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".std_lec_del");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "수강 취소 되었습니다.";
		
		peopleMngService.std_lec_del(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".std_lec_del");
		
		return resultMap;
	}
	
	
	/* 강사 */
	
	/* 강사 관리 초기 화면*/
	@RequestMapping("tutorControl.do")
	public String tutor_list(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		logger.info("   - paramMap : " + paramMap);
		return "adm/tutorMng";
	}
	
	/* 강사 리스트 */
	@RequestMapping("list_tut.do")
	public String tut_list(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		logger.info("   - paramMap : " + paramMap);

		String searchKey = (String) paramMap.get("searchKey");
		String searchWord = (String) paramMap.get("searchWord");
		int currentPage = Integer.parseInt((String) paramMap.get("currentPage")); // 현재
		logger.info("   - currentPage : " + currentPage);																			// 페이지
																					// 번호
		int pageSize= Integer.parseInt((String) paramMap.get("pageSize")); // 페이지
																			// 사이즈
		int pageIndex = (currentPage - 1) * pageSize;
		logger.info("   - pageIndex : " + pageIndex);	
		logger.info("+ Start " + className + ".list_tut");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		paramMap.put("searchWord", searchWord);

		// 강사 목록 조회
		List<PeopleMngModel> list_tut = peopleMngService.tut_list(paramMap);
		model.addAttribute("list_tut", list_tut);
		logger.info("   - list_tut : " + list_tut);

		// 강사 목록 카운트 조회
		int totalCount = peopleMngService.countList_tut(paramMap);
		model.addAttribute("totalCnt", totalCount);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("currentPage", currentPage);

		logger.info("   - totalCnt : " + totalCount);
		logger.info("   - pageSize : " + pageSize);
		logger.info("   - currentPage : " + currentPage);

		logger.info("+ End " + className + ".list_tut");
	
	
		return "adm/tutList";	
		
	}
	
	/* 강사 리스트 */
	@RequestMapping("list_tut_json.do")
	@ResponseBody
	public Map<String, Object> tut_list_json(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		logger.info("   - paramMap : " + paramMap);

		String searchKey = (String) paramMap.get("searchKey");
		String searchWord = (String) paramMap.get("searchWord");
		int currentPage = Integer.parseInt((String) paramMap.get("currentPage")); // 현재
		logger.info("   - currentPage : " + currentPage);																			// 페이지
																					// 번호
		int pageSize= Integer.parseInt((String) paramMap.get("pageSize")); // 페이지
																			// 사이즈
		int pageIndex = (currentPage - 1) * pageSize;
		logger.info("   - pageIndex : " + pageIndex);	
		logger.info("+ Start " + className + ".list_tut");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		paramMap.put("searchWord", searchWord);

		// 강사 목록 조회
		List<PeopleMngModel> list_tut = peopleMngService.tut_list(paramMap);
		//model.addAttribute("list_tut", list_tut);
		logger.info("   - list_tut : " + list_tut);

		// 강사 목록 카운트 조회
		int totalCount = peopleMngService.countList_tut(paramMap);
//		model.addAttribute("totalCnt", totalCount);
//		model.addAttribute("pageSize", pageSize);
//		model.addAttribute("currentPage", currentPage);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("list_tut", list_tut);
		resultMap.put("totalCnt", totalCount);
		resultMap.put("pageSize", pageSize);
		resultMap.put("currentPage", currentPage);

		logger.info("   - totalCnt : " + totalCount);
		logger.info("   - pageSize : " + pageSize);
		logger.info("   - currentPage : " + currentPage);

		logger.info("+ End " + className + ".list_tut");
	
	
		return resultMap;
		
	}
	
	
		//강사의 강의만 조회
		@RequestMapping("list_lec_json1.do")
		@ResponseBody
		public Map<String, Object> tut_lec_json1(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
				HttpServletResponse response, HttpSession session) throws Exception {
			logger.info("   - paramMap : " + paramMap);

			// 강사의 강의만 조회
			List<PeopleMngModel> list_tut = peopleMngService.tlec_list(paramMap);
			logger.info("   - list_tut : " + list_tut);
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("list_tut", list_tut);

			logger.info("+ End " + className + ".list_tut");
		
		
			return resultMap;
			
		}
		
		//전체 학생 정보를 출력하고 수정 하기 위함 
		@RequestMapping("list_stu_json.do")
		@ResponseBody
		public Map<String, Object> list_stu_json(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
				HttpServletResponse response, HttpSession session) throws Exception {
			logger.info("   - paramMap : " + paramMap);

			// 강사의 강의만 조회
			List<PeopleMngModel> list_stu = peopleMngService.stu_list(paramMap);
			logger.info("   - list_stu : " + list_stu);
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("list_stu", list_stu);

			logger.info("+ End " + className + ".list_stu");
		
		
			return resultMap;
			
		}
		
		//전체 학생 정보 중에서 새로운 학생을 등록하기 위함 
		@RequestMapping("new_stu.do")
		@ResponseBody
		public Map<String, Object> new_stu(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
				HttpServletResponse response, HttpSession session) throws Exception {
			
			logger.info("+ Start " + className + ".new_stu");
			logger.info("   - paramMap : " + paramMap);

			String result = "SUCCESS";
			String resultMsg = "뉴비 입성";
			
			peopleMngService.new_stu(paramMap, request);
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("result", result);
			resultMap.put("resultMsg", resultMsg);
			
			logger.info("+ End " + className + ".new_stu");
			
			return resultMap;
		}
	
	//승인강사 디테일을 위해서 쓰임 	
	@RequestMapping("tutorView.do")
	@ResponseBody
	@Transactional
	public Map<String, Object> tutorView(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
	                                     HttpServletResponse response, HttpSession session) throws Exception {

	    logger.info("+ Start " + className + ".tutorView");
	    logger.info("  - paramMap : " + paramMap);

	    // 반환할 데이터를 담을 Map 객체
	    Map<String, Object> returnMap = new HashMap<>();

	    // 강사 상세 정보 조회
	    PeopleMngModel selInfo = peopleMngService.tutorView(paramMap);

	    returnMap.put("selinfo", selInfo);

	    logger.info("+ End " + className + ".tutorView");

	    return returnMap;
	}
	
	
	
	// 강사 승인
	@RequestMapping("apv_tut.do")
	@ResponseBody
	public Map<String, Object> apv_tut(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".apv_tut");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "강사 승인 되었습니다.";
		
		peopleMngService.apv_tut(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".apv_tut");
		
		return resultMap;
	}
	// 강사 승인 거부 
	@RequestMapping("apv_tut1.do")
	@ResponseBody
	public Map<String, Object> apv_tut1(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".apv_tut1");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "강사 승인이 취소 되었습니다.";
		
		peopleMngService.apv_tut1(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".apv_tut1");
		
		return resultMap;
	}
	
	//강사리스트만 출력하기 위함 
		@RequestMapping("tutor_list1.do")
		@ResponseBody
		public Map<String, Object> tutor_list1(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
				HttpServletResponse response, HttpSession session) throws Exception {
			logger.info("    -paramMap : " + paramMap);
			
			String searchKey = (String) paramMap.get("searchKey");
			String searchWord = (String) paramMap.get("searchWord");
			int currentPage = Integer.parseInt((String) paramMap.get("currentPage"));
			logger.info("  -currentPage : " + currentPage);
			
			int pageSize= Integer.parseInt((String) paramMap.get("pageSize")); // 페이지
			// 사이즈
			int pageIndex = (currentPage - 1) * pageSize;
			logger.info("   - pageIndex : " + pageIndex);	
			logger.info("+ Start " + className + ".list_tut");
			logger.info("   - paramMap : " + paramMap);
			
			paramMap.put("pageIndex", pageIndex);
			paramMap.put("pageSize", pageSize);
			paramMap.put("searchWord", searchWord);
			
			// 강사 목록 조회
			List<PeopleMngModel> list_tut = peopleMngService.t_list(paramMap);
			//model.addAttribute("list_tut", list_tut);
			logger.info("   - list_tut : " + list_tut);
			
			// 강사 목록 카운트 조회
			int totalCount = peopleMngService.t_count(paramMap);
			//model.addAttribute("totalCnt", totalCount);
			//model.addAttribute("pageSize", pageSize);
			//model.addAttribute("currentPage", currentPage);
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			
			resultMap.put("list_tut", list_tut);
			resultMap.put("totalCnt", totalCount);
			resultMap.put("pageSize", pageSize);
			resultMap.put("currentPage", currentPage);
			
			logger.info("   - totalCnt : " + totalCount);
			logger.info("   - pageSize : " + pageSize);
			logger.info("   - currentPage : " + currentPage);
			
			logger.info("+ End " + className + ".list_tut");
			
			
			return resultMap;
		}
		@RequestMapping("tutor_list2.do")
		@ResponseBody
		public Map<String, Object> tutor_list2(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
				HttpServletResponse response, HttpSession session) throws Exception {
			logger.info("    -paramMap : " + paramMap);
			
			String searchKey = (String) paramMap.get("searchKey");
			String searchWord = (String) paramMap.get("searchWord");
			int currentPage = Integer.parseInt((String) paramMap.get("currentPage"));
			logger.info("  -currentPage : " + currentPage);
			
			int pageSize= Integer.parseInt((String) paramMap.get("pageSize")); // 페이지
			// 사이즈
			int pageIndex = (currentPage - 1) * pageSize;
			logger.info("   - pageIndex : " + pageIndex);	
			logger.info("+ Start " + className + ".list_tut");
			logger.info("   - paramMap : " + paramMap);
			
			paramMap.put("pageIndex", pageIndex);
			paramMap.put("pageSize", pageSize);
			paramMap.put("searchWord", searchWord);
			
			// 강사 목록 조회
			List<PeopleMngModel> list_tut = peopleMngService.t_list(paramMap);
			//model.addAttribute("list_tut", list_tut);
			logger.info("   - list_tut : " + list_tut);
			
			// 강사 목록 카운트 조회
			int totalCount = peopleMngService.t_count(paramMap);
			//model.addAttribute("totalCnt", totalCount);
			//model.addAttribute("pageSize", pageSize);
			//model.addAttribute("currentPage", currentPage);
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			
			resultMap.put("list_tut", list_tut);
			resultMap.put("totalCnt", totalCount);
			resultMap.put("pageSize", pageSize);
			resultMap.put("currentPage", currentPage);
			
			logger.info("   - totalCnt : " + totalCount);
			logger.info("   - pageSize : " + pageSize);
			logger.info("   - currentPage : " + currentPage);
			
			logger.info("+ End " + className + ".list_tut");
			
			
			return resultMap;
		}



}
