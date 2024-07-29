package kr.happyjob.study.item.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.item.vo.ItemVO;

public interface ItemDAO {
	
	List<ItemVO> itemList(Map<String, Object> paramMap);
	List<ItemVO> itemDetail(Map<String, Object> paramMap);
	int itemModify(Map<String, Object> paramMap);
	int itemCnt(Map<String, Object> paramMap)throws Exception;
	List<ItemVO> itemList1(Map<String, Object> paramMap);

}
