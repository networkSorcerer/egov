package kr.happyjob.study.management.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.management.model.ManagementModel;

public interface ManagementDao {
	
	
	public List<ManagementModel> userList(Map<String, Object> paramMap) throws Exception;
	
	public List<ManagementModel> userDetail(Map<String, Object> paramMap) throws Exception;
	
	public List<ManagementModel> custDetail(Map<String, Object> paramMap) throws Exception;
	
	public int regist(Map<String, Object> paramMap) throws Exception;
	
	public int userAjust(Map<String, Object> paramMap) throws Exception;

	public int userListCnt(Map<String, Object> paramMap) throws Exception;
	
	public int userDelete(Map<String, Object> paramMap) throws Exception;

	public List<Map<String, Object>> warehouseList(Map<String, Object> paramMap);

	public int newStorageSave(Map<String, Object> paramMap);

	public List<Map<String, Object>> warehouseDetail(Map<String, Object> paramMap);

//	public int noticeSave(Map<String, Object> paramMap) throws Exception;
//
//	public int noticeUpdate(Map<String, Object> paramMap) throws Exception;
//
//	public int noticeDelete(Map<String, Object> paramMap) throws Exception;
//
//	public int noticeSaveFile(Map<String, Object> paramMap);
//
//	public int noticeUpdateFile(Map<String, Object> paramMap);
}