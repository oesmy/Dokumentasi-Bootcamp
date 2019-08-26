
package com.bootcamp.ujianwebservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "groups")
public class Group {
	@Id
	@Column(name = "id")
	@SerializedName("id")
	@Expose
	private int id;
	@Column(name = "code")
	@SerializedName("code")
	@Expose
	private String code;
	@Column(name = "name")
	@SerializedName("name")
	@Expose
	private String name;
	@Column(name = "project_id")
	@SerializedName("project_id")
	@Expose
	private int projectId;
	@Column(name = "minimum_personnel")
	@SerializedName("minimum_personnel")
	@Expose
	private Integer minimumPersonnel;
	@Column(name = "description")
	@SerializedName("description")
	@Expose
	private String description;
	@Column(name = "attendance_qr_code")
	@SerializedName("attendance_qr_code")
	@Expose
	private String attendanceQrCode;
	@Column(name = "status")
	@SerializedName("status")
	@Expose
	private Integer status;

	public Group() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getMinimumPersonnel() {
		return minimumPersonnel;
	}

	public void setMinimumPersonnel(Integer minimumPersonnel) {
		this.minimumPersonnel = minimumPersonnel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttendanceQrCode() {
		return attendanceQrCode;
	}

	public void setAttendanceQrCode(String attendanceQrCode) {
		this.attendanceQrCode = attendanceQrCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
