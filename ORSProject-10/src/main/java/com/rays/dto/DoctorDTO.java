package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_doctor")
public class DoctorDTO extends BaseDTO {

	@Column(name = "doctor_name", length = 50)
	private String doctorName;

	@Column(name = "mobile", length = 50)
	private String mobile;

	@Column(name = "experties", length = 50)
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "doctorName";
	}

	@Override
	public String getUniqueValue() {
		return doctorName;
	}

	@Override
	public String getLabel() {
		return doctorName;
	}

	@Override
	public String getTableName() {
		return "doctor";
	}
}