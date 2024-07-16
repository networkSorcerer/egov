package kr.happyjob.study.practice.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.practice.dao.CustomerDAO;
import kr.happyjob.study.practice.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO cdao;
	
	@Override
	public int customerCnt(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return cdao.customerCnt(paramMap);
	}

	@Override
	public List<CustomerVO> customerList(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return cdao.customerList(paramMap);
	}

}
