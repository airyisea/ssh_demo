package com.airyisea.rs.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.airyisea.rs.domain.User;
import com.airyisea.rs.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void save(User user) {
		System.out.println("保存用户：" + user);

	}

	@Override
	public User findById(Integer id) {
		User user = new User();
		user.setId(1);
		user.setName("中野梓");
		return user;
	}

	@Override
	public List<User> find() {
		User user = new User();
		user.setId(1);
		user.setName("中野梓");
		User user2 = new User();
		user2.setId(2);
		user2.setName("中村纱羽");
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		return list;
	}

	@Override
	public User findByIdAndName(Integer id, String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		return user;
	}

	@Override
	public void deleteById(Integer id) {
		System.out.println(id + "号用户删除");
	}

	@Override
	public User update(User user) {
		System.out.println("更新用户：" + user);
		return user;
	}

}
