package kr.happyjob.study.adm.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.adm.dao.PeopleMngDao;
import kr.happyjob.study.adm.model.PeopleMngModel;

@Service
public class PeopleMngServiceImpl implements PeopleMngService {
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	// Get class name for logger
	private final String className = this.getClass().toString();
	
	@Autowired
	PeopleMngDao peopleMngDao;

	// 회원 탈퇴
	@Override
	public int ban_user(Map<String, Object> paramMap) {
		return peopleMngDao.ban_user(paramMap);
	}
	
	// 회원 정보 조회
	@Override
	public PeopleMngModel user_info(Map<String, Object> paramMap) {
		return peopleMngDao.user_info(paramMap);
	}

	// 강의 리스트 조회
	@Override
	public List<PeopleMngModel> lec_list(Map<String, Object> paramMap) {
		return peopleMngDao.lec_list(paramMap);
	}

	// 강의 수 조회
	@Override
	public int countList_lec(Map<String, Object> paramMap) {
		return peopleMngDao.countList_lec(paramMap);
	}
	
	// 학생 목록 조회
	@Override
	public List<PeopleMngModel> std_list(Map<String, Object> paramMap) {
		return peopleMngDao.std_list(paramMap);
	}

	// 학생 수  조회
	@Override
	public int countList_std(Map<String, Object> paramMap) {
		return peopleMngDao.countList_std(paramMap);
	}

	// 학생 수강 목록 조회
	@Override
	public List<PeopleMngModel> std_lec_info(Map<String, Object> paramMap) {
		return peopleMngDao.std_lec_info(paramMap);
	}

	// 학생 수강 강의 수 조회
	@Override
	public int std_lec_count(Map<String, Object> paramMap) {
		return peopleMngDao.std_lec_count(paramMap);
	}
	
	// 학생 수강 신청
	@Override
	public int std_lec_reg(Map<String, Object> paramMap) {
		peopleMngDao.plusPrePnum(paramMap);
		return peopleMngDao.std_lec_reg(paramMap);
	}

	// 학생 수강 취소
	@Override
	public int std_lec_del(Map<String, Object> paramMap) {
		peopleMngDao.minusPrePnum(paramMap);
		return peopleMngDao.std_lec_del(paramMap);
	}
	
	// 강사 목록 조회
	@Override
	public List<PeopleMngModel> tut_list(Map<String, Object> paramMap) {
		return peopleMngDao.tut_list(paramMap);
	}

	// 강사 수 조회
	@Override
	public int countList_tut(Map<String, Object> paramMap) {
		return peopleMngDao.countList_tut(paramMap);
	}
	
	// 강사 승인
	@Override
	public int apv_tut(Map<String, Object> paramMap) {
		return peopleMngDao.apv_tut(paramMap);
	}
	// 강사 승인
	@Override
	public int apv_tut1(Map<String, Object> paramMap) {
		return peopleMngDao.apv_tut1(paramMap);
	}
	
	// 강사 강의 목록 조회
	@Override
	public List<PeopleMngModel> tlec_list(Map<String, Object> paramMap) {
		return peopleMngDao.tlec_list(paramMap);
	}

	// 강사 강의 수 조회
	@Override
	public int tut_lec_count(Map<String, Object> paramMap) {
		return peopleMngDao.tut_lec_count(paramMap);
	}
	
	//강사 상세 조회
	public PeopleMngModel tutorView(Map<String, Object> paramMap) throws Exception{
		return peopleMngDao.tutorView(paramMap);
	}

//	@Override
//	public List<PeopleMngModel> tut_list_json(Map<String, Object> paramMap) {
//		return peopleMngDao.tut_list_json(paramMap);
//	}
	
	@Override
	public List<PeopleMngModel> t_list(Map<String, Object> paramMap) {
		return peopleMngDao.t_list(paramMap);
	}
	//미승인 강사를 출력하기 위함
	@Override
	public List<PeopleMngModel> t_list2(Map<String, Object> paramMap) {
		return peopleMngDao.t_list(paramMap);
	}
	
	@Override
	public List<PeopleMngModel> l_list(Map<String, Object> paramMap) {
		return peopleMngDao.l_list(paramMap);
	}

	@Override
	public int t_count(Map<String, Object> paramMap) {
		return peopleMngDao.t_count(paramMap);
	}

	@Override
	public List<PeopleMngModel> stu_list(Map<String, Object> paramMap) throws Exception{
		return peopleMngDao.stu_list(paramMap);
	}
	//뉴비 입성
	@Override
	public int new_stu(Map<String, Object> paramMap, HttpServletRequest request)throws Exception {
		return peopleMngDao.new_stu(paramMap);
	}

	


}
