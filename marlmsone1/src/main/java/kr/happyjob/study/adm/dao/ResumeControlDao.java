package kr.happyjob.study.adm.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.adm.model.AdmLectureDto;
import kr.happyjob.study.adm.model.StudentResumeDto;

public interface ResumeControlDao {
	
	public List<AdmLectureDto> getAllLectureList(Map<String, Object> paramMap);
	public int lectureListTotalCount(String searchRoomName);
	
	public List<StudentResumeDto> getStudentResumeList(String lectureId);
	public int studentResumeTotalCount(String lectureId);
	
	public List<StudentResumeDto> getStudentResumeListJson(Map<String, Object> paramMap) throws Exception;
	public int studentResumeTotalCountJson(Map<String, Object> paramMap) throws Exception;
	
	
	public StudentResumeDto getStudentResume(Map<String, Object> param);
}
