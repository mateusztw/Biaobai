package org.java.pojo;

import java.util.Date;
/**
 * ������������û�����Ϣ���ѣ��������׵Ķ����Ǹ��û�������Ϣ����
 * @author DELL
 *
 */
public class BiaobaiMessage {
	private int id;
	private int type;
	private int message_id;//��Ӧ��Message��id
	private Date post_date;//���ۻ�ظ���ʱ��
	private int readed;//�Ƿ��Ѿ��Ķ�
	private String from_uid;//���ۻ�ظ����û�
	private String to_uid;//���ۻ�ظ���Ŀ���û�
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	public int getReaded() {
		return readed;
	}
	public void setReaded(int readed) {
		this.readed = readed;
	}
	public String getFrom_uid() {
		return from_uid;
	}
	public void setFrom_uid(String from_uid) {
		this.from_uid = from_uid;
	}
	public String getTo_uid() {
		return to_uid;
	}
	public void setTo_uid(String to_uid) {
		this.to_uid = to_uid;
	}
}
