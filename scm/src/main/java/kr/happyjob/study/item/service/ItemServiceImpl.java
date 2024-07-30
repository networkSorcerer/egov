package kr.happyjob.study.item.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.item.dao.ItemDAO;
import kr.happyjob.study.item.vo.ItemVO;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemDAO id;
	
	@Override
	public List<ItemVO> itemList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return id.itemList(paramMap);
	}

	@Override
	public List<ItemVO> itemDetail(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return id.itemDetail(paramMap);
	}

	@Override
	public int itemModify(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return id.itemModify(paramMap);
	}

	@Override
	public int itemCnt(Map<String, Object> paramMap)throws Exception {
		// TODO Auto-generated method stub
		return id.itemCnt(paramMap);
	}

	@Override
	public List<ItemVO> itemList1(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return id.itemList1(paramMap);
	}

	@Override
	public List<ItemVO> itemCode(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return id.itemCode(paramMap);
	}

}
