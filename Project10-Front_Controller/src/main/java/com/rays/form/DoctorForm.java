package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DoctorDTO;

public class DoctorForm extends BaseForm {

	@NotEmpty(message = "Doctor Name is required")
	private String doctorName;

	@NotNull(message = "Mobile No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String mobile;

	@NotEmpty(message = "Experties is required")
	private String experties;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getExperties() {
		return experties;
	}

	public void setExperties(String experties) {
		this.experties = experties;
	}

	@Override
	public BaseDTO getDto() {

		DoctorDTO dto = initDTO(new DoctorDTO());
		dto.setDoctorName(doctorName);
		dto.setMobile(mobile);
		dto.setExperties(experties);

		return dto;

	}
}