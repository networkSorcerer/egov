package kr.happyjob.study.cust.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.cust.vo.CustVO;
import kr.happyjob.study.practice.vo.CustomerVO;

public interface CustDAO {
	public List<CustVO> custList(Map<String, Object> paramMap)throws Exception;
	
	public int custSave(Map<String, Object> paramMap) throws Exception;
	
	public int customerCnt(Map<String, Object> paramMap);

	public List<CustVO> customerList(Map<String, Object> paramMap)throws Exception;
	
	public List<CustVO> cDetail(Map<String, Object> paramMap)throws Exception;

}
