package com.zhun;

import com.zhun.mapper.UserMapper;
import com.zhun.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindAll() {
		List<User> userList = userMapper.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testFindById() {
		User user = userMapper.findById(1);
		System.out.println("查询结果: " + user);
	}

	@Test
	public void testInsert() {
		User user = new User();
		user.setUsername("test_insert");
		user.setPassword("123456");
		user.setName("测试用户");
		user.setAge(18);
		userMapper.insert(user);
		System.out.println("新增成功，ID: " + user.getId());
	}

	@Test
	public void testUpdate() {
		User user = userMapper.findById(1);
		if (user != null) {
			user.setName("更新后的名字");
			user.setAge(99);
			userMapper.update(user);
			System.out.println("修改成功: " + user);
		}
	}

	@Test
	public void testDeleteById() {
		userMapper.deleteById(4);
	}
}