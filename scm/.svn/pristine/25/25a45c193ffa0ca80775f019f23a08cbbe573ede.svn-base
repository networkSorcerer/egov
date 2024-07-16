package kr.happyjob.study.executive.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.executive.dao.ExecutiveDao;

@Service
public class ExecutiveServiceImpl implements ExecutiveService{
	
	@Autowired
	ExecutiveDao executiveDao;
	
	@Override
	public List<Map<String, Object>> storageAll(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.storageAll(paramMap);
	}

	@Override
	public List<Map<String, Object>> storageDetail(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.storageDetail(paramMap);
	}

	@Override
	public List<Map<String, Object>> salesList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.salesList(paramMap);
	}

	@Override
	public List<Map<String, Object>> salesTop(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub

		if (paramMap.get("orderBy") == null) {
			paramMap.put("orderBy", "sales");
		}
		
		return executiveDao.salesTop(paramMap);
	}

	@Override
	public List<Map<String, Object>> orderApprovalY(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.orderApprovalY(paramMap);
	}

	@Override
	public List<Map<String, Object>> orderApprovalN(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.orderApprovalN(paramMap);
	}

	@Override
	public List<Map<String, Object>> returnApprovalY(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.returnApprovalY(paramMap);
	}

	@Override
	public List<Map<String, Object>> returnApprovalN(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.returnApprovalN(paramMap);
	}

	@Override
	public void approvalY(Map<String, Object> paramMap) {

		executiveDao.approvalY(paramMap);
	}

	@Override
	public List<Map<String, Object>> chart(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return executiveDao.chart(paramMap);
	}




	


}
