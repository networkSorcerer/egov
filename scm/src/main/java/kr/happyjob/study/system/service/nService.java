package kr.happyjob.study.system.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.system.model.nModel;

public interface nService {

	public List<nModel> n1List(Map<String, Object> paramMap) throws Exception;

	public int nListCnt(Map<String, Object> paramMap) throws Exception;

	public int nSave(Map<String, Object> paramMap) throws Exception;

}
