package com.recruit.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.recruit.domain.AmainVO;
import com.recruit.persistence.AmainDAO;

@Service
public class AmainServiceImpl implements AmainService {
	
	@Inject
	private AmainDAO dao;
	
	@Override
	public AmainVO read(String id) throws Exception{
		return dao.read(id);
	}
	
	@Override
	public void modify(AmainVO vo) throws Exception{
		dao.update(vo);
	}
	
	@Override
	public void remove(String id) throws Exception{
		dao.delete(id);
	}
	
	@Override
	public List<AmainVO> listAll() throws Exception{
		return dao.listAll();
	}

}
