package org.java.pojo;

import java.sql.Timestamp;
/**
 * �������
 * @author DELL
 *
 */
public class Biaobai5 extends BiaobaiBase{

	private String bobject;//��׶���
	private String title;//����
	private String content;//����
	private String contentwithouthtml;//ȥ����ʽ������
	private String imgUrl;//ͼƬ·��
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getBobject() {
		return bobject;
	}
	public void setBobject(String bobject) {
		this.bobject = bobject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

	
}
