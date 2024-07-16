package kr.happyjob.study.practice.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.practice.vo.CustomerVO;

public interface CustomerService {

	public int customerCnt(Map<String, Object> paramMap)throws Exception;

	public List<CustomerVO> customerList(Map<String, Object> paramMap)throws Exception;

}
