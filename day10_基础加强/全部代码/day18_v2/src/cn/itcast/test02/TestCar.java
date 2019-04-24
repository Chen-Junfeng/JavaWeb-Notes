package cn.itcast.test02;

public class TestCar {
	public static void main(String[] args) {
		 ICar car=new GoogleCar();
		 car.start();
		 car.run();
		 car.stop();
	}
}
