package s2sh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import s2sh.dao.DemoDao;
import s2sh.entity.Demo;

public class DemoDaoImpl implements DemoDao {

	// ��SSH��������Ҫʹ��ĳ��ʵ������ô�Ͷ�������һ������Ȼ��
	// �������set����������springע�������
	// ʵ�ֲ�Ҫ��ע���ʵ������������Լ���ô��������������˭
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Demo> getInfo() {
		// sessionFactory���ʵ�������Լ��������hibernate��ͳд������Ҳ���Խ���springȥ�й�
		// Configuration cfg = new Configuration().configure();
		// sessionFactory = cfg.buildSessionFactory();

		// ��ȡsession
		Session session = sessionFactory.openSession();

		// ���浱ʹ��JPA��ʱ��EntityManager ������ Session
		Query query = session.createQuery("from Demo");

		// �����е����ݲ�ѯ�������ŵ�List������
		List<Demo> demoInfo = query.getResultList();

		// �����ϱ���ѭ��
		for (Demo demo : demoInfo) {
			// ��ӡ���������̨
			System.out.println(demo);
		}

		// �ر�session
		session.close();
		// �ر�sessionFactory
		sessionFactory.close();
		// ����list����
		return demoInfo;

	}

}
