package org.java.dao;

import java.util.List;

import org.java.pojo.Famous;

/**
 * ͳ�Ʊ���ȶȰ�
 * @author DELL
 *
 */
public interface IFamousDao{
	public void add(String name);//����һ����¼������Ѿ����ڣ���ô������Ƶ�ʼ�1
	public void update(String name);//����������¼������б�ױ�ɾ���ˣ���Ӧ�ı���ȶȰ��ϵ�����ҲҪ�б仯
	public List<Famous>load();//��ȡ���е�����
}