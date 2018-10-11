package s2sh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import s2sh.entity.Demo;
import s2sh.service.DemoService;

//����IndexAction(action��)�̳�ActionSupport�ӿ�
public class DemoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private DemoService demoService;

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	// ��дexecute()����
	public String execute() {

		// ��ȡDemoServiceʵ��������getInfo()����
		// ��������浽List������
		List<Demo> demoInfo = demoService.getInfo();

		// ����ѯ�����Ľṹ����ӡ������̨
		System.out.println("�������" + demoInfo.size());

		// ��ȡContext�����Ķ���
		ActionContext ac = ActionContext.getContext();
		// ��myBookCardList������ӵ������Ķ�����
		ac.put("demoInfo", demoInfo);

		// ����һ���ַ���
		return "success";
	}
}
