package cn.starlin.service;

import cn.starlin.pojo.User;

import java.util.Set;


public interface UserService {

	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);

	/**
	 * ͨ���û�����ѯ��ɫ��Ϣ
	 * @param userName
	 * @return
	 */
	public Set<String> getRoles(String userName);

	/**
	 * ͨ���û�����ѯȨ����Ϣ
	 * @param userName
	 * @return
	 */
	public Set<String> getPermissions(String userName);
}
