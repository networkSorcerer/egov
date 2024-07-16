package kr.happyjob.study.system.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.happyjob.study.system.model.NoticeModel1;

public interface NoticeService1 {
	public List<NoticeModel1> noticeList(Map<String, Object> paramMap) throws Exception;

	public int noticeListCnt(Map<String, Object> paramMap) throws Exception;

	public int noticeSave(Map<String, Object> paramMap) throws Exception;

	public int noticeUpdate(Map<String, Object> paramMap) throws Exception;

	public int noticeDelete(Map<String, Object> paramMap) throws Exception;

	public NoticeModel1 noticeDetail(Map<String, Object> paramMap) throws Exception;

	public int noticeSaveFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception;

	public int noticeUpdateFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception;

	public List<NoticeModel1> MainNoticeList(Map<String, Object> paramMap);
}
