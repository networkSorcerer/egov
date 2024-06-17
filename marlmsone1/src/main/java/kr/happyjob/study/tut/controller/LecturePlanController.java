package kr.happyjob.study.tut.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.adm.model.LectureRoomVO;
import kr.happyjob.study.system.service.ComnCodService;
import kr.happyjob.study.tut.model.LecturePlanModel;
import kr.happyjob.study.tut.model.LectureRoomModel;
import kr.happyjob.study.tut.service.LecturePlanService;
@Controller
@RequestMapping("/tut")
public class LecturePlanController {
	
	@Autowired
	LecturePlanService lecturePlanService;
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	
	@RequestMapping("lecturePlan.do")
	public String initLecture(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		paramMap.put("tutor_id", session.getAttribute("loginId"));

		// 강의 리스트 가져오기
		List<LecturePlanModel> lecList = lecturePlanService.tutorLecList(paramMap);
		model.addAttribute("lecList", lecList);
		logger.info("lecList:" + lecList);
		
		// 강의 분류명 가져오기
		List<LecturePlanModel> typeList = lecturePlanService.lecTypeList(paramMap);
		model.addAttribute("typeList", typeList);
		logger.info("typeList:" + typeList);
		
		//강의실 리스트가져오기
		List<LectureRoomModel> lecRoom = lecturePlanService.room_name(paramMap);
		model.addAttribute("lecRoom", lecRoom);
		return "tut/lecNotice";
	}
	
	@RequestMapping("lecturePlanJson1.do")
	@ResponseBody
	public Map<String,Object> initLectureJson1(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		paramMap.put("tutor_id", session.getAttribute("loginId"));
		Map<String,Object> resultMap = new HashMap<>();
		// 강의 리스트 가져오기
		List<LecturePlanModel> lecList = lecturePlanService.tutorLecList(paramMap);
		model.addAttribute("lecList", lecList);
		logger.info("lecList:" + lecList);
		
		// 강의 분류명 가져오기
		List<LecturePlanModel> typeList = lecturePlanService.lecTypeList(paramMap);
		model.addAttribute("typeList", typeList);
		logger.info("typeList:" + typeList);
		
		//강의실 리스트가져오기
		List<LectureRoomModel> lecRoom = lecturePlanService.room_name(paramMap);
		model.addAttribute("lecRoom", lecRoom);
		
		resultMap.put("lecList", lecList);
		resultMap.put("typeList", typeList);
		resultMap.put("lecRoom", lecRoom);
		return resultMap;
	}
	
	
	
	/**
	 * 강의계획서 초기 화면
	 */
	@RequestMapping("lecturePlanJson.do")
	@ResponseBody
	public Map<String,Object> lecturePlan(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".lecturePlan");
		logger.info("   - paramMap : " + paramMap);

		Map<String,Object> returnmap = new HashMap<String,Object>();
		
		
		// object 타입으로 넘겨 받음 -> String 형변환 -> int 타입으로 변환
		int cpage = Integer.valueOf((String) paramMap.get("cpage"));
		int pagesize = Integer.valueOf((String) paramMap.get("pagesize"));
		
		int startpos = (cpage-1) * pagesize;
		
		paramMap.put("startpos", startpos);
		paramMap.put("pagesize", pagesize);
		
		List<LecturePlanModel> listdata = lecturePlanService.tutorLecList(paramMap);
		int listcnt = lecturePlanService.countLecList(paramMap);
		returnmap.put("listdata", listdata);
		returnmap.put("listcnt", listcnt);
		logger.info("listdata" + listdata);
		

		
		
		return returnmap;
	}
	
		
	//이거 따라해보자
/*	public Map<String,Object> lectureRoomListjson(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".lectureRoomListjson");
		logger.info("   - paramMap : " + paramMap);

		Map<String,Object> returnmap = new HashMap<String,Object>();
		
		
		// object 타입으로 넘겨 받음 -> String 형변환 -> int 타입으로 변환
		int cpage = Integer.valueOf((String) paramMap.get("cpage"));
		int pagesize = Integer.valueOf((String) paramMap.get("pagesize"));
		
		int startpos = (cpage-1) * pagesize;
		
		paramMap.put("startpos", startpos);
		paramMap.put("pagesize", pagesize);
		
		List<LectureRoomVO> listdata = lectureRoomService.lectureRoomList(paramMap);
		int listcnt = lectureRoomService.lectureRoomCnt(paramMap);
		
		returnmap.put("listdata", listdata);
		returnmap.put("listcnt", listcnt);
		
		logger.info("+ End " + className + ".lectureRoomListjson");

		return returnmap; */
	
	/**
	 * 강의 목록 조회
	 */
	@RequestMapping("fLectureList.do")
	public String fLectureList(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		paramMap.put("tutor_id", session.getAttribute("loginId"));
		int currentPage = Integer.parseInt((String) paramMap.get("currentPage")); 
		int pageSize = Integer.parseInt((String) paramMap.get("pageSize")); 
		int pageIndex = (currentPage - 1) * pageSize;
		String searchWord = (String) paramMap.get("searchWord");
		
		logger.info("+ Start " + className + ".fLectureList");
		logger.info("   - paramMap : " + paramMap);

		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		paramMap.put("searchWord_lec", searchWord);

		logger.info("   - putparamMap : " + paramMap);

		// 강의 리스트 가져오기
		List<LecturePlanModel> lecList = lecturePlanService.tutorLecList(paramMap);
		model.addAttribute("lecList", lecList);
		logger.info("lecList:" + lecList);

		// 강의 목록 카운트 조회
		int totalCount = lecturePlanService.countLecList(paramMap);
		model.addAttribute("totalCnt", totalCount);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("currentPage", currentPage);
		
		logger.info("lecList:" + lecList);

		logger.info("+ End " + className + ".fLectureList");


		return "/tut/lecNoticeList";
	}
	
	
	//에프 렉쳐 리스트 2.do
	@RequestMapping("fLectureListJson.do")
	@ResponseBody
	public Map<String,Object> fLectureListJson(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		int currentPage = Integer.parseInt((String) paramMap.get("currentPage")); 
		int pageSize = Integer.parseInt((String) paramMap.get("pageSize")); 
		int pageIndex = (currentPage - 1) * pageSize;
		String searchWord = (String) paramMap.get("searchWord");
		String progress = (String) paramMap.get("progress");
		Map<String,Object> returnmap = new HashMap<String,Object>();
		
		paramMap.put("tutor_id", session.getAttribute("loginId"));
		
		logger.info("+ Start " + className + ".fLectureListJson");
		logger.info("   - paramMap : " + paramMap);	
		
		paramMap.put("pageIndex", pageIndex);
		paramMap.put("pageSize", pageSize);
		paramMap.put("searchWord_lec", searchWord);
		paramMap.put("progress", progress);
		
		// 강의 리스트 가져오기
		List<LecturePlanModel> lecList = lecturePlanService.tutorLecList(paramMap);
		// 강의 목록 카운트 조회
		int totalCount = lecturePlanService.countLecList(paramMap);
		
		returnmap.put("listdata", lecList);
		returnmap.put("listcnt", totalCount);
		
		logger.info("+ End " + className + ".fLectureList2");
		logger.info("lecList:" + lecList);

		logger.info("+ End " + className + ".fLectureList");
		
		// 강의실 조회
		List<LectureRoomModel> lec_room = lecturePlanService.room_name(paramMap);
		returnmap.put("lec_room", lec_room);
		logger.info("lec_room" + lec_room);
		logger.info("+ End " + className + ".fLectureListJson");

		return returnmap;
	}
	
	// 모달 강의정보
	@RequestMapping("fLecInfo.do")
	@ResponseBody
	public Map<String, Object> select_adv(Model model, @RequestParam Map<String, Object> paramMap,
			HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {

		logger.info("+ Start " + className + ".fLecInfo");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "조회 되었습니다.";
		
		//모달창 강의정보 출력
		LecturePlanModel lec_info = lecturePlanService.plan_one(paramMap);
		
		//주차 계획 리스트 출력
		List<LecturePlanModel> week_plan=lecturePlanService.week_list(paramMap);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		resultMap.put("lec_info", lec_info);
		resultMap.put("week_plan", week_plan);

		logger.info("+ End " + className + ".fLecInfo");

		return resultMap;
	}

	//계획서 저장
	@RequestMapping("savePlan.do")
	@ResponseBody
	public Map<String, Object> save_advice(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
	
		logger.info("+ Start " + className + ".savePlan");
		logger.info("   - paramMap : " + paramMap);
		String result = "SUCCESS";
		String resultMsg = "저장 되었습니다.";
		
		lecturePlanService.plan_register(paramMap);
	
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".savePlan");
		
		return resultMap;
	}	
	
	//주간계획 저장
	@RequestMapping("saveWeekplan.do")
	@ResponseBody
	public Map<String, Object> week_plan_insert(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session,@RequestParam(value="week[]") List<String> week,@RequestParam(value="learn_goal[]") List<String> learn_goal,@RequestParam(value="learn_con[]") List<String> learn_con) throws Exception {
		
		logger.info("week:"+week);
		logger.info("learn_goal:"+learn_goal);
		logger.info("learn_con:"+learn_con);
	
		for (int i = 0; i < week.size(); i++) {
			paramMap.put("week",week.get(i));
			paramMap.put("learn_goal",learn_goal.get(i));
			paramMap.put("learn_con",learn_con.get(i));
			
			//체크해서 값이 없으면 insert 있으면 수정
			if(lecturePlanService.chk_week(paramMap)>0){
				lecturePlanService.week_up(paramMap);
			}else{
				lecturePlanService.week_register(paramMap);
			}
		}
		
		logger.info("+ Start " + className + ".saveWeekplan");
		logger.info("   - paramMap : " + paramMap);
		String result = "SUCCESS";
		String resultMsg = "저장 되었습니다.";
	
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".saveWeekplan");
		
		return resultMap;
	}
	
	//주간 계획삭제
	@RequestMapping("delWeekPlan.do")
	@ResponseBody
	public Map<String, Object> deleteComnDtlCod(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".delWeekPlan");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "삭제 되었습니다.";
		
		lecturePlanService.week_del(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".delWeekPlan");
		
		return resultMap;
	}
	
	//Vue 프로젝트를 위해 추가함	
	@RequestMapping("LecInfoDetail.do")
	@ResponseBody
	public Map<String, Object> LecInfoDetail(Model model, 
										@RequestParam Map<String, Object> paramMap,
										HttpServletRequest request, 
										HttpServletResponse response, HttpSession session) throws Exception {

		logger.info("+ Start " + className + ".LecInfoDetail");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "조회 되었습니다.";
		
		//강의계획서 상세 정보 출력
		LecturePlanModel lec_info = lecturePlanService.plan_one(paramMap);
		
		// 강의 분류명 가져오기
		List<LecturePlanModel> typeList = lecturePlanService.lecTypeList(paramMap);
		
		//강의실 리스트가져오기
		List<LectureRoomModel> lecRoom = lecturePlanService.room_name(paramMap);		
				
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		resultMap.put("lec_info", lec_info);
		resultMap.put("type_list", typeList);
		resultMap.put("lec_room", lecRoom);

		logger.info("+ End " + className + ".LecInfoDetail");

		return resultMap;
	}
	
	//Vue 프로젝트를 위해 추가함	
	@RequestMapping("WeekplanList.do")
	@ResponseBody
	public Map<String, Object> WeekplanList(Model model, 
										@RequestParam Map<String, Object> paramMap,
										HttpServletRequest request, 
										HttpServletResponse response, 
										HttpSession session) throws Exception {

		logger.info("+ Start " + className + ".WeekplanList");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "조회 되었습니다.";		
			
		//주차 계획 리스트 출력
		List<LecturePlanModel> week_plan = lecturePlanService.week_list(paramMap);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		resultMap.put("week_plan", week_plan);

		logger.info("+ End " + className + ".WeekplanList");

		return resultMap;
	}
		
	//Vue 프로젝트를 위해 추가함
	//주간계획 저장
	@RequestMapping("WeekPlanSave.do")
	@ResponseBody
	public Map<String, Object> WeekPlanSave(Model model, 
									@RequestParam Map<String, Object> paramMap, 
									HttpServletRequest request,
									HttpServletResponse response, 
									HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".WeekPlanSave");
		logger.info("   - paramMap : " + paramMap);
		
		String action = (String)paramMap.get("action");
		int weekcnt = 0;
		int sreturn = 0;
		String result = "SUCCESS";
		String resultMsg = "저장되었습니다.";
		Map<String, Object> resultMap = new HashMap<String, Object>();			
		
		if("I".equals(action)){
			weekcnt = lecturePlanService.chk_week(paramMap);
			if (weekcnt > 0) {
				result = "FAIL";
				resultMsg = "이미 등록된 주차 계획입니다.";
			} else {
				sreturn = lecturePlanService.week_register(paramMap);
				if(sreturn == 0){					
					result = "FAIL";
					resultMsg = "저장 실패하였습니다.";
				}
			}	
		} else if("U".equals(action)){
			sreturn = lecturePlanService.week_up(paramMap);
			logger.info("sreturn: " + sreturn);
			if(sreturn == 0){
				result = "FAIL";
				resultMsg = "저장 실패하였습니다.";
			}
		}				
	
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".WeekPlanSave");
		
		return resultMap;
	}
	
	//Vue 프로젝트를 위해 추가함	
	//주간 계획삭제
	@RequestMapping("WeekPlanDelete.do")
	@ResponseBody
	public Map<String, Object> WeekPlanDelete(Model model, 
										@RequestParam Map<String, Object> paramMap, 
										HttpServletRequest request,
										HttpServletResponse response, 
										HttpSession session) throws Exception {
		
		logger.info("+ Start " + className + ".WeekPlanDelete");
		logger.info("   - paramMap : " + paramMap);

		String result = "SUCCESS";
		String resultMsg = "삭제 되었습니다.";
		
		lecturePlanService.week_del(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		logger.info("+ End " + className + ".WeekPlanDelete");
		
		return resultMap;
	}
}


