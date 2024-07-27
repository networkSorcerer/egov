package kr.happyjob.study.item.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.item.vo.ItemVO;

public interface ItemService {

	List<ItemVO> itemList(Map<String, Object> paramMap);

	List<ItemVO> itemDetail(Map<String, Object> paramMap);

	int itemModify(Map<String, Object> paramMap);

}
