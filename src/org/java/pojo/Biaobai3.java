package org.java.pojo;
import java.sql.Timestamp;
/**
 * �����ѱ��
 * @author DELL
 *
 */
public class Biaobai3 extends BiaobaiBase{
	private String roommateName;//��������
	private String gender;//�Ա�
	private String department;//ѧԺ
	private String grade;//�꼶
	private String contact;//������ϵ��ʽ
	private String content;//����
	private String contentwithouthtml;//ȥ����ʽ������
	private String imgUrl;//ͼƬ·��

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRoommateName() {
		return roommateName;
	}
	public void setRoommateName(String roommateName) {
		this.roommateName = roommateName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentwithouthtml() {
		return contentwithouthtml;
	}
	public void setContentwithouthtml(String contentwithouthtml) {
		this.contentwithouthtml = contentwithouthtml;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
