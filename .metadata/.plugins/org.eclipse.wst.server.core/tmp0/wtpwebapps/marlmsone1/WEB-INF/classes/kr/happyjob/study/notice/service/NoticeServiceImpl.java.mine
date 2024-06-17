package kr.happyjob.study.notice.service;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.happyjob.study.common.comnUtils.FileUtilCho;
import kr.happyjob.study.notice.dao.NoticeDao;
import kr.happyjob.study.notice.model.Noticevo;

@Service
public class NoticeServiceImpl implements NoticeService {

	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	// Get class name for logger
	private final String className = this.getClass().toString();
	
	@Autowired
	NoticeDao noticeDao;
	
	@Value("${fileUpload.rootPath}") //happyjob.properties에서 기본적으로 설정된거 있는데 그 정보를 불러온다는거.
	private String rootPath;
	
	@Value("${fileUpload.noticePath}")
	private String itemPath;
	
	@Value("${fileUpload.virtualRootPath}")
	private String virtualRootPath;	
	
	/** 목록 조회 */
	public List<Noticevo> noticelist(Map<String, Object> paramMap) throws Exception {
		
		List<Noticevo> listdata = noticeDao.noticelist(paramMap);
		
		return listdata;
	}
	
	/** 카운트 조회 */
	public int noticecnt(Map<String, Object> paramMap) throws Exception {
		
		int totalCount = noticeDao.noticecnt(paramMap);
		
		return totalCount;
	}
	
	/** 신규 공지 등록 */
	public int noticeSave(Map<String, Object> paramMap,HttpServletRequest request) throws Exception{
		
		return noticeDao.noticeSave(paramMap);
	};
	
	/**삭제*/
	public int noticeDelete(Map<String, Object> paramMap) throws Exception{
		return noticeDao.noticeDelete(paramMap);
	};

	
	/** 조회수 수정 */
	public void noticehitupdate(Map<String, Object> paramMap) throws Exception{
		noticeDao.noticehitupdate(paramMap);
	};
	
	/** 상세 조회 */
	public Noticevo noticeView(Map<String, Object> paramMap) throws Exception{
		return noticeDao.noticeView(paramMap);
	};


	/**수정*/
	public int noticeModify(Map<String, Object> paramMap) throws Exception{
		
		return noticeDao.noticeModify(paramMap);
	};
	
	
}
