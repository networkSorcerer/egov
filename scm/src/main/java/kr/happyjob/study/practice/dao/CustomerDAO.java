package kr.happyjob.study.practice.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.practice.vo.CustomerVO;

public interface CustomerDAO {
	public int customerCnt(Map<String, Object> paramMap)throws Exception;

	public List<CustomerVO> customerList(Map<String, Object> paramMap)throws Exception;

}
