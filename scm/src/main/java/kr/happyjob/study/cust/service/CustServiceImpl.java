package kr.happyjob.study.cust.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.cust.dao.CustDAO;
import kr.happyjob.study.cust.vo.CustVO;
import kr.happyjob.study.practice.vo.CustomerVO;

@Service
public class CustServiceImpl implements CustService {
	
	@Autowired
	CustDAO cdao;
	

	@Override
	public List<CustVO> custList(Map<String, Object> paramMap) throws Exception {
		return cdao.custList(paramMap);
	}


	@Override
	public int custSave(Map<String, Object> paramMap)throws Exception {
		// TODO Auto-generated method stub
		return cdao.custSave(paramMap);
	}


	@Override
	public int customerCnt(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return cdao.customerCnt(paramMap);
	}


	@Override
	public List<CustVO> customerList(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return cdao.customerList(paramMap);
	}


	@Override
	public List<CustVO> cDetail(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return cdao.cDetail(paramMap);
	}


	@Override
	public int custModify(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return cdao.custModify(paramMap);
	}


	@Override
	public int custInsert(Map<String, Object> paramMap) throws Exception{
		// TODO Auto-generated method stub
		return cdao.custInsert(paramMap);
	}


	@Override
	public int custDel(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return cdao.custDel(paramMap);
	}


	


}
