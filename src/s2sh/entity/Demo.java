package s2sh.entity;

/**
 * 跟数据库表一致，作为一个java对象
 * 1个对象代表的是数据库表中的一行记录
 * 1个属性代表的是表中的一个字段
 */
public class Demo {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
