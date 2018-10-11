package s2sh.service.impl;

import java.util.List;

import s2sh.dao.DemoDao;
import s2sh.entity.Demo;
import s2sh.service.DemoService;

public class DemoServiceImpl implements DemoService {

	private DemoDao demoDao;

	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	@Override
	public List<Demo> getInfo() {

		// 本类应该编写业务逻辑的代码，
		// 但本例没有业务逻辑，就不用写。

		// 访问数据库的代码，不会出现在service这一层
		// 交给dao来操作数据库
		List<Demo> demoInfo = demoDao.getInfo();

		// 进行其它的业务逻辑操作，比如增加多一个选项，是否过期
		// 本例不需要
		// ....

		return demoInfo;
	}
}
