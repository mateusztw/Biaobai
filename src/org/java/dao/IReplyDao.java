package org.java.dao;

import java.util.List;

import org.java.pojo.Reply;


/**
 * ���ۺͻظ�����ɾ�Ĳ�
 * @author DELL
 *
 */
public interface IReplyDao {
	public void add(Reply reply);
	public void delete(int id);//ɾ������
	public void delete(int m_id,int kind,int r_id);//ɾ�������۵Ļظ��������а���Message��id��Reply�����ͺ�Reply��id
	public void update(Reply reply);//����Reply
	public List<Reply>list(int m_id,int type);
	public List<Reply> list(String to_uid);//�����û���id�ҳ����и�����û���Reply��Ϊ����Ϣ֪ͨ
}
