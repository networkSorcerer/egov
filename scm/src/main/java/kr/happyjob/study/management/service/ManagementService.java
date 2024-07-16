package kr.happyjob.study.management.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.happyjob.study.management.model.ManagementModel;

public interface ManagementService {
	public List<ManagementModel> userList(Map<String, Object> paramMap) throws Exception;
	
	public List<ManagementModel> userDetail(Map<String, Object> paramMap) throws Exception;
	
	public List<ManagementModel> custDetail(Map<String, Object> paramMap) throws Exception;
	
	public int userListCnt(Map<String, Object> paramMap) throws Exception;
	
	public int regist(Map<String, Object> paramMap) throws Exception;
	
	public int userAjust(Map<String, Object> paramMap) throws Exception;
	
	public int userDelete(Map<String, Object> paramMap) throws Exception;

	public List<Map<String, Object>> warehouseList(Map<String, Object> paramMap);

	public int newStorageSave(Map<String, Object> paramMap);

	public List<Map<String, Object>> warehouseDetail(Map<String, Object> paramMap);
	
	/*
	public List<NoticeModel> userList2(Map<String, Object> paramMap) throws Exception;

	public int noticeSave(Map<String, Object> paramMap) throws Exception;

	public int noticeUpdate(Map<String, Object> paramMap) throws Exception;

	public int noticeDelete(Map<String, Object> paramMap) throws Exception;

	public NoticeModel noticeDetail(Map<String, Object> paramMap) throws Exception;

	public int noticeSaveFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception;

	public int noticeUpdateFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception;
	*/
}

