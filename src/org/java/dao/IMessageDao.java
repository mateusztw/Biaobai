package org.java.dao;


import java.util.List;

import org.java.pojo.BiaobaiMessage;

/**
 * �����ۺͱ�׽�����Ϣ���ѵĲ���
 * 
 * @author DELL
 *
 */
public interface IMessageDao {
	public void add(BiaobaiMessage biaobai);//���
	public void delete(int id);//ɾ��
	public void update(BiaobaiMessage biaobai);//�������ݿ���ԭ�е�BiaobaiMessage����
	public BiaobaiMessage load(int id);//ͨ���Լ���id��ȡ��BiaobaiMessage����
	public List<BiaobaiMessage> list();//��ѯ���ݿ��ж�����û���׵�����
	public List<BiaobaiMessage> list(String username);//�����û�id��ѯ���ݿ��ж�����û���׵�����
}
