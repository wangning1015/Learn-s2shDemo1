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

		// ����Ӧ�ñ�дҵ���߼��Ĵ��룬
		// ������û��ҵ���߼����Ͳ���д��

		// �������ݿ�Ĵ��룬���������service��һ��
		// ����dao���������ݿ�
		List<Demo> demoInfo = demoDao.getInfo();

		// ����������ҵ���߼��������������Ӷ�һ��ѡ��Ƿ����
		// ��������Ҫ
		// ....

		return demoInfo;
	}
}
