package kr.happyjob.study.system.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.system.model.NoticeModel1;

public interface NoticeDao1 {
	public List<NoticeModel1> noticeList(Map<String, Object> paramMap) throws Exception;

	public int noticeListCnt(Map<String, Object> paramMap) throws Exception;

	public int noticeSave(Map<String, Object> paramMap) throws Exception;

	public int noticeUpdate(Map<String, Object> paramMap) throws Exception;

	public int noticeDelete(Map<String, Object> paramMap) throws Exception;

	public NoticeModel1 noticeDetail(Map<String, Object> paramMap) throws Exception;

	public int noticeSaveFile(Map<String, Object> paramMap);

	public int  noticeUpdateFile(Map<String, Object> paramMap);
	
	public List<NoticeModel1> MainNoticeList(Map<String, Object> paramMap);

}
