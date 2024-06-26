package kr.happyjob.study.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.system.dao.NoticeDao;
import kr.happyjob.study.system.model.NoticeModel;
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	NoticeDao noticeDao;
	@Override
	public List<NoticeModel> noticeList(Map<String, Object > paramMap) throws Exception {
		return noticeDao.noticeList(paramMap);
	}
	@Override
	public int noticeListCnt() throws Exception {
		return noticeDao.noticeListCnt();
	}
	@Override
	public int noticeSave(Map<String, Object> paramMap) throws Exception {
	    return noticeDao.noticeSave(paramMap);
	}


}
