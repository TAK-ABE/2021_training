package jp.co.aforce.text;

class Car {
	
		//スピード保持するフィールド
		private int speed;
		
		int getSpeed() {
			return this.speed;
		}
		
		//スピードをあげるメソッド
		void speedUp(int value) {
			if(value < 0) {
				return;
			}
			this.speed += value;
			
			if(this.speed >= 180) {
				this.speed = 180;
			}
		}
		
		//スピードを下げるメソッド
		void speedDown(int value) {
			if(value < 0) {
				return;
			}
			this.speed -= value;
			
			if(this.speed <= -15) {
				this.speed = -15;
			}
		}
}
