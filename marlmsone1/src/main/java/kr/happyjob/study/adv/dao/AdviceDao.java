package kr.happyjob.study.adv.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.adv.model.AdviceVo;
import kr.happyjob.study.adv.model.LecInfoVo;
/*import kr.happyjob.study.notice.model.Noticevo;*/
import kr.happyjob.study.adv.model.LecStdInfoVo;

public interface AdviceDao {

	/** 강의 목록 조회(리액트,jsp) */
	public List<LecInfoVo> lecList(Map<String, Object> paramMap) throws Exception;
	
	/** 강의 목록 카운트 조회 */
	public int lecListCnt(Map<String, Object> paramMap) throws Exception;
	
	/** 상담 목록 조회 (jsp)*/
	public List<AdviceVo> advList(Map<String, Object> paramMap) throws Exception;
	
	/** 상담 목록 카운트 조회 */
	public int advListCnt(Map<String, Object> paramMap) throws Exception;
	
	/** 상담 상세보기 */
	public AdviceVo advDetail(Map<String, Object> paramMap) throws Exception;
	
	/** 강의 수강 학생 목록 조회 */
	public List<LecStdInfoVo> lecStdList(Map<String, Object> paramMap) throws Exception;
	
	/** 강의 수강 학생 목록 카운트 조회 */
	public int lecStdListCnt(Map<String, Object> paramMap) throws Exception;
	
	/** 상담 등록 */
	public int advRegister(Map<String,Object> paramMap);
	
	/** 상담 수정 */
	public int advUpdate(Map<String,Object> paramMap);
	
	/** 상담 삭제 */
	public int advDelete(Map<String,Object> paramMap);
	
	/** 상담 목록 조회(리액트)*/
	public List<AdviceVo> advListJson(Map<String, Object> paramMap) throws Exception;
	
	/**  학생 목록 조회(리액트)*/
	public List<LecStdInfoVo> stdListJson(Map<String, Object> paramMap) throws Exception;
	
	/** 상담 목록 카운트 조회(리액트) */
	public int advListCntR(Map<String, Object> paramMap) throws Exception;
	
	/** 상담 상세보기(리액트) */
	public AdviceVo advDetailR(Map<String, Object> paramMap) throws Exception;
//강의 리스트만 출력하기 위함 
	public List<LecInfoVo> lecList1(Map<String, Object> paramMap) throws Exception;
	
}
