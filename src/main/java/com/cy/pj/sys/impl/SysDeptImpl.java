package com.cy.pj.sys.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cy.pj.sys.dao.SysDeptDao;
import com.cy.pj.sys.service.SysDeptService;

public class SysDeptImpl implements SysDeptService {
	@Autowired
	private SysDeptDao sysDeptDao;
	@Override
	public List<Map<String, Object>> fianObjects() {
		return sysDeptDao.findObjects();
	}

}
