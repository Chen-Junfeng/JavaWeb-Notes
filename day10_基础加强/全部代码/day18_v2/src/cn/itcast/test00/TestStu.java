package cn.itcast.test00;

public class TestStu {
	public static void main(String[] args) {
		Stu stu1=Stu.getInstance();
		Stu stu2=Stu.getInstance();
		Stu stu3=Stu.getInstance();
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
	}
}
