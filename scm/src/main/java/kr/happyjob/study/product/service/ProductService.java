package kr.happyjob.study.product.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.product.vo.ProductVO;

public interface ProductService {

	List<ProductVO> productList(Map<String, Object> paramMap);

	int productCnt(Map<String, Object> paramMap);

	List<ProductVO> productDetail(Map<String, Object> paramMap);

	int productModify(Map<String, Object> paramMap);

}
