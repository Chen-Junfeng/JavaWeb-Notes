package cn.itcast.test00;

public class Stu {
	private  Stu() {
	}
	
	private static Stu stu=new Stu();
	
	public static  Stu getInstance(){
		return stu;
	}
}
