
package com.bootcamp.ujianwebservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "position")
public class Position {
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
	@Column(name = "description")
	@SerializedName("description")
	@Expose
	private String description;
	@Column(name = "status")
	@SerializedName("status")
	@Expose
	private Integer status;
	@Column(name = "created_by_user_id")
	@SerializedName("created_by_user_id")
	@Expose
	private Integer createdByUserId;
	@Column(name = "updated_by_user_id")
	@SerializedName("updated_by_user_id")
	@Expose
	private String updatedByUserId;
	@Column(name = "created_at")
	@SerializedName("created_at")
	@Expose
	private String createdAt;
	@Column(name = "updated_at")
	@SerializedName("updated_at")
	@Expose
	private String updatedAt;
	@Column(name = "deleted_by_user")
	@SerializedName("deleted_by_user")
	@Expose
	private String deletedByUser;
	@Column(name = "deleted_at")
	@SerializedName("deleted_at")
	@Expose
	private String deletedAt;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(Integer createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedByUserId(String updatedByUserId) {
		this.updatedByUserId = updatedByUserId;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setDeletedByUser(String deletedByUser) {
		this.deletedByUser = deletedByUser;
	}

	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

}
