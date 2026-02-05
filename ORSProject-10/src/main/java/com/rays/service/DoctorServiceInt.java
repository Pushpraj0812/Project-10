package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.DoctorDTO;

public interface DoctorServiceInt extends BaseServiceInt<DoctorDTO> {

	public DoctorDTO findByExpertise(String experties, UserContext userContext);

}