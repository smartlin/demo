package cn.starlin.service.impl;

import cn.starlin.dao.UserDao;
import cn.starlin.pojo.User;
import cn.starlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public User getByUserName(String userName) {
		return userDao.getByUserName(userName);
	}

	public Set<String> getRoles(String userName) {
		return userDao.getRoles(userName);
	}

	public Set<String> getPermissions(String userName) {
		return userDao.getPermissions(userName);
	}

}
