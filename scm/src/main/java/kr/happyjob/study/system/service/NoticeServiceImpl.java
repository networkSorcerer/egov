package kr.happyjob.study.system.service;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.happyjob.study.common.comnUtils.FileUtilCho;
import kr.happyjob.study.system.dao.NoticeDao;
import kr.happyjob.study.system.model.NoticeModel;
@Service
public class NoticeServiceImpl implements NoticeService {
	
	
	@Autowired
	NoticeDao noticeDao;
	
	@Value("${fileUpload.rootPath}")
	private String rootPath;

	@Value("${fileUpload.virtualRootPath}")
	private String virtualRootPath;

	@Value("${fileUpload.noticePath}")
	private String noticePath;

	
	@Override
	public List<NoticeModel> noticeList(Map<String, Object > paramMap) throws Exception {
		return noticeDao.noticeList(paramMap);
	}
	@Override
	public int noticeListCnt(Map<String, Object> paramMap) throws Exception {
		return noticeDao.noticeListCnt(paramMap);
	}
	@Override
	public int noticeSave(Map<String, Object> paramMap) throws Exception {
	    return noticeDao.noticeSave(paramMap);
	}
	@Override
	public NoticeModel noticeDetail(Map<String, Object> paramMap) throws Exception {
		
		return noticeDao.noticeDetail(paramMap);
	}
	@Override
	public int noticeUpdate(Map<String, Object> paramMap) throws Exception {
		return noticeDao.noticeUpdate(paramMap);
	}
	@Override
	public int noticeDelete(Map<String, Object> paramMap)throws Exception {
		return noticeDao.noticeDelete(paramMap);
	}
	@Override
	public int noticeSaveFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception {
		// 1. 업도르된 파일을 db에 저장 
		
		MultipartHttpServletRequest MultipartHttpServletRequest = (MultipartHttpServletRequest)request;
		
		
		String itemFilePath = noticePath + File.separator;
		FileUtilCho fileUpload = new FileUtilCho(MultipartHttpServletRequest, rootPath, virtualRootPath, itemFilePath);
		
		Map<String , Object> fileInfo = fileUpload.uploadFiles();
		
		if(fileInfo.get("file_nm") == null) {
			paramMap.put("fileYn","N" );
			paramMap.put("fileInfo",null );
		} else {
			paramMap.put("fileYn","" );
			paramMap.put("fileInfo",fileInfo );

		}	
		
		return noticeDao.noticeSaveFile(paramMap);
	}
	


}
