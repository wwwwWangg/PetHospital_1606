package com.itheima.po;
/**
 * 客户持久化类
 */
public class User {
	private Integer id;       // 主键id
	private String role;	//权限
	private String name;// 客户名称
	private String pwd; //密码
	private String address;      // 地址
	private String tel;     // 电话

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", role='" + role + '\'' +
				", name='" + name + '\'' +
				", pwd='" + pwd + '\'' +
				", address='" + address + '\'' +
				", tel='" + tel + '\'' +
				'}';
	}
}


