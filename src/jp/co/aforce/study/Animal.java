package jp.co.aforce.study;

public class Animal {
	
	private String name;
	private int age;
	
		//名前を設定
	void setName(String name) {
			this.name = name;
		}
		
		//年齢を設定
		void setAge(int age) {
			this.age = age;
		}
		
		void showProfile() {
			System.out.println("名前は" + this.name + "年齢は" + this.age + "齢です");
		}
	
}
