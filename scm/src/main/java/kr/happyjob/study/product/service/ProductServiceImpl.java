package kr.happyjob.study.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.product.dao.ProductDAO;
import kr.happyjob.study.product.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO pdao;
	
	@Override
	public List<ProductVO> productList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return pdao.productList(paramMap);
	}

	@Override
	public int productCnt(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return pdao.productCnt(paramMap);
	}

}
