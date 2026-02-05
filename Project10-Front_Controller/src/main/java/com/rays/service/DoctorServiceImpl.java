package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.DoctorDAOInt;
import com.rays.dto.DoctorDTO;

@Service
@Transactional
public class DoctorServiceImpl extends BaseServiceImpl<DoctorDTO, DoctorDAOInt> implements DoctorServiceInt {

	@Transactional(readOnly = true)
	public DoctorDTO findByName(String experties, UserContext userContext) {
		return baseDao.findByUniqueKey("experties", experties, userContext);
	}
}