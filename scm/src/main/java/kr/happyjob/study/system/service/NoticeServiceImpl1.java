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
import kr.happyjob.study.system.dao.NoticeDao1;
import kr.happyjob.study.system.model.NoticeModel1;

@Service
public class NoticeServiceImpl1 implements NoticeService1 {

	@Autowired
	NoticeDao1 noticeDao;

	@Value("${fileUpload.rootPath}")
	private String rootPath;

	@Value("${fileUpload.virtualRootPath}")
	private String virtualRootPath;

	@Value("${fileUpload.noticePath}")
	private String noticePath;

	@Override
	public List<NoticeModel1> noticeList(Map<String, Object> paramMap) throws Exception {

		return noticeDao.noticeList(paramMap);
	}

	@Override
	public int noticeListCnt(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return noticeDao.noticeListCnt(paramMap);
	}

	@Override
	public int noticeSave(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return noticeDao.noticeSave(paramMap);
	}

	@Override
	public NoticeModel1 noticeDetail(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return noticeDao.noticeDetail(paramMap);
	}

	@Override
	public int noticeUpdate(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return noticeDao.noticeUpdate(paramMap);
	}

	@Override
	public int noticeDelete(Map<String, Object> paramMap) throws Exception {
		// 1. 업로드 되었던 파일을 삭제
		NoticeModel1 orginFile = noticeDao.noticeDetail(paramMap);
		if (orginFile.getFile_name() != null) {
			File oldFile = new File(orginFile.getPhsycal_path());
			oldFile.delete();
		}
		return noticeDao.noticeDelete(paramMap);
	}

	@Override
	public int noticeSaveFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception {

		// 업로드 된 파일을 db에 저장
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;

		String itemFilePath = noticePath + File.separator;
		FileUtilCho fileUpload = new FileUtilCho(multipartHttpServletRequest, rootPath, virtualRootPath, itemFilePath);

		Map<String, Object> fileInfo = fileUpload.uploadFiles();

		if (fileInfo.get("file_nm") == null) {
			paramMap.put("fileYn", "N");
			paramMap.put("fileinfo", null);
		} else {
			paramMap.put("fileYn", "Y");
			paramMap.put("fileinfo", fileInfo);
		}

		return noticeDao.noticeSaveFile(paramMap);
	}

	@Override
	public int noticeUpdateFile(Map<String, Object> paramMap, HttpServletRequest request) throws Exception {

		// 1. 업로드 되었던 파일을 삭제
		NoticeModel1 orginFile = noticeDao.noticeDetail(paramMap);
		if (orginFile.getFile_name() != null) {
			File oldFile = new File(orginFile.getPhsycal_path());
			oldFile.delete();
		}

		// 2. 수정 된 파일을 폴더에 저장
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;

		String itemFilePath = noticePath + File.separator;
		FileUtilCho fileUpload = new FileUtilCho(multipartHttpServletRequest, rootPath, virtualRootPath, itemFilePath);

		Map<String, Object> fileInfo = fileUpload.uploadFiles();

		if (fileInfo.get("file_nm") == null) {
			paramMap.put("fileYn", "N");
			paramMap.put("fileinfo", null);
		} else {
			paramMap.put("fileYn", "Y");
			paramMap.put("fileinfo", fileInfo);
		}

		return noticeDao.noticeUpdateFile(paramMap);
	}

	@Override
	public List<NoticeModel1> MainNoticeList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return noticeDao.MainNoticeList(paramMap);
	}

}