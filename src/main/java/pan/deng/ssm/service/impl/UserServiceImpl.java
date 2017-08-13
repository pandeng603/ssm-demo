package pan.deng.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pan.deng.ssm.dao.UserDao;
import pan.deng.ssm.pojo.User;
import pan.deng.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		User user = userDao.selectByPrimaryKey(userId);
		return user;
	}

}
