package kr.happyjob.study.system.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.system.model.NoticeModel;

public interface NoticeService {
	public List<NoticeModel> noticeList(Map<String, Object > paramMap) throws Exception;
	
	public int noticeListCnt() throws Exception;
	
	public int noticeSave(Map<String, Object > paramMap) throws Exception;
}
