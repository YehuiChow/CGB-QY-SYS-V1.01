package com.cy.pj.sys.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface SysDeptService	  {
	List<Map<String,Object>> fianObjects();
}
