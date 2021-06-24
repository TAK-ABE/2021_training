package jp.co.aforce.text;

public class Main {
	public static void main(String[] args) {
		
		//Carクラスのインスタンス化//
		Car car = new Car();
		
//		//speedフィールドに80を代入
//		car.speed = 80;
//		
//		//speedフィールドの値を参照
//		System.out.println("スピード:" + car.speed);
//		
//		int newSpeed = 80;
//		car.speedUp(newSpeed);
//		System.out.println("スピード:" + car.speed);
		
		car.speedUp(40);
		car.speedDown(10);
		
		System.out.println("速度 = " + car.getSpeed());
		
		
		//トラックのインスタンス生成
		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);
		//親クラスのspeedUpを親クラスのCarから持ってこれる
		
		
	}
}
