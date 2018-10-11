package s2sh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import s2sh.entity.Demo;
import s2sh.service.DemoService;

//创建IndexAction(action类)继承ActionSupport接口
public class DemoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private DemoService demoService;

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	// 编写execute()方法
	public String execute() {

		// 获取DemoService实例，调用getInfo()方法
		// 将结果保存到List集合里
		List<Demo> demoInfo = demoService.getInfo();

		// 将查询出来的结构集打印到控制台
		System.out.println("结果集：" + demoInfo.size());

		// 获取Context上下文对象
		ActionContext ac = ActionContext.getContext();
		// 将myBookCardList集合添加到上下文对象里
		ac.put("demoInfo", demoInfo);

		// 返回一个字符串
		return "success";
	}
}
