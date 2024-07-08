package kr.happyjob.study.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.system.dao.nDAO;
import kr.happyjob.study.system.model.nModel;

@Service
public class nServiceImpl implements nService {
	@Autowired
	nDAO ndao;
	
	@Override
	public List<nModel> nList(Map<String, Object> paramMap)throws Exception {
		return ndao.nList(paramMap);
	}

	@Override
	public int nListCnt(Map<String, Object> paramMap) throws Exception {
		return ndao.nListCnt(paramMap);
	}

	@Override
	public int nSave(Map<String, Object> paramMap) throws Exception {
	return ndao.nSave(paramMap);
	}

}