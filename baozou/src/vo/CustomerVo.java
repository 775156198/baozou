package vo;

import java.sql.Date;

public class CustomerVo {
	private String customer_phone_number;
	private String password;
	private int sex;
	private String customer_name;
	private String idcard_number;
	private int grade;
	private Date regist_time;
	private Date last_change_time;
	public CustomerVo(String customer_phone_number, String password, int sex, String customer_name,
			String idcard_number, int grade, Date regist_time, Date last_change_time) {
		super();
		this.customer_phone_number = customer_phone_number;
		this.password = password;
		this.sex = sex;
		this.customer_name = customer_name;
		this.idcard_number = idcard_number;
		this.grade = grade;
		this.regist_time = regist_time;
		this.last_change_time = last_change_time;
	}
	public CustomerVo() {
		super();
	}
	public String getCustomer_phone_number() {
		return customer_phone_number;
	}
	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getIdcard_number() {
		return idcard_number;
	}
	public void setIdcard_number(String idcard_number) {
		this.idcard_number = idcard_number;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Date regist_time) {
		this.regist_time = regist_time;
	}
	public Date getLast_change_time() {
		return last_change_time;
	}
	public void setLast_change_time(Date last_change_time) {
		this.last_change_time = last_change_time;
	}
	@Override
	public String toString() {
		return "CustomerVo [customer_phone_number=" + customer_phone_number + ", password=" + password + ", sex=" + sex
				+ ", customer_name=" + customer_name + ", idcard_number=" + idcard_number + ", grade=" + grade
				+ ", regist_time=" + regist_time + ", last_change_time=" + last_change_time + "]";
	}
	
	
	
	
}
