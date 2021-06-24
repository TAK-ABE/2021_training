package jp.co.aforce.study;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//Dogクラスのインスタンス生成
		Dog dog = new Dog();
		
//		dog.name ="ポチ";
//		dog.age = 3;
		
		dog.setName("ポチ");
		
		dog.setAge(3);
		
		//情報の表示	
		dog.showProfile();
		
		
		Cat cat = new Cat();
		
		cat.setName("タマ");
		//
		cat.setAge(5);
		
		//情報の表示	
		cat.showProfile();
	}

}
