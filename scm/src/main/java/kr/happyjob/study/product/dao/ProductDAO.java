package kr.happyjob.study.product.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.product.vo.ProductVO;

public interface ProductDAO {
	List<ProductVO> productList(Map<String, Object> paramMap);
	int productCnt(Map<String, Object> paramMap);

}
