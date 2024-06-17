package kr.happyjob.study.adm.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.happyjob.study.adm.model.PeopleMngModel;

public interface PeopleMngDao {
	/* 공통 */
	
	// 회원 탈퇴
	public int ban_user(Map<String,Object> paramMap);

	// 회원 정보 조회
	public PeopleMngModel user_info(Map<String,Object> paramMap);
	
	/* 학생 */
	
	// 강의 리스트 조회
	public List<PeopleMngModel> lec_list(Map<String, Object> paramMap);
	
	// 강의 수 조회
	public int countList_lec(Map<String,Object> paramMap);

	// 수강등록 가능한 강의 리스트 조회
	public List<PeopleMngModel> lecreg_list(Map<String, Object> paramMap);
	
	// 수강신청 가능한 강의 수 조회
	public int countList_lecreg(Map<String,Object> paramMap);		
	
	// 학생 목록 조회
	public List<PeopleMngModel> std_list(Map<String,Object> paramMap);
	
	// 학생 수 조회
	public int countList_std(Map<String,Object> paramMap);
	
	// 학생 수강 목록 조회
	public List<PeopleMngModel> std_lec_info(Map<String,Object> paramMap);
	
	// 학생 수강 강의 수 조회
	public int std_lec_count(Map<String,Object> paramMap);
	
	// 학생 수강 신청
	public int std_lec_reg(Map<String,Object> paramMap);
	
	// 학생 수강 취소
	public int std_lec_del(Map<String,Object> paramMap);
	// 전체 학생 출력 수정
	public List<PeopleMngModel> stu_list(Map<String, Object> paramMap);
	// 뉴비 등록
	int new_stu(Map<String, Object> paramMap) throws Exception;
	
	// 수강 인원 증가
	public void plusPrePnum(Map<String,Object> paramMap);
	
	// 수강 인원 감소
	public void minusPrePnum(Map<String,Object> paramMap);

	
	/* 강사 */
	
	// 강사 목록 조회
	public List<PeopleMngModel> tut_list(Map<String,Object> paramMap);
	
	// 강사 수 조회
	public int countList_tut(Map<String,Object> paramMap);

	// 강사 승인
	public int apv_tut(Map<String,Object> paramMap);
	// 강사 승인 거부
	public int apv_tut1(Map<String, Object> paramMap);
	// 강사 강의 목록 조회
	public List<PeopleMngModel> tlec_list(Map<String,Object> paramMap);
	
	// 강사 강의 수 조회
	public int tut_lec_count(Map<String,Object> paramMap);
	
	//강사 상세 조회
	public PeopleMngModel tutorView(Map<String, Object> paramMap) throws Exception;
	// 강사 만 조회
//	public List<PeopleMngModel> tut_list_json(Map<String, Object> paramMap);
	
	//강의 목록 조회
	public List<PeopleMngModel> l_list(Map<String, Object> paramMap);
	//강사 리스트 조회
	public List<PeopleMngModel> t_list(Map<String,Object> paramMap);
	//강사 수 조회
	public int t_count(Map<String, Object> paramMap);
	
	
}
