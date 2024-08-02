package test240719.object1;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] ani = new Animal[5];
		
		ani[0] = new Dog("흰둥이", "시고르자브종", 20);
		ani[1] = new Cat("럭키", "먼치킨", "우리집", "흰색");
		ani[2] = new Dog("깜둥이", "시고르자브종", 16);
		ani[3] = new Cat("비키", "노르웨이숲", "우리집", "주황색");
		ani[4] = new Dog("삼둥이", "시고르자브종", 10);
		
		for(Animal animal : ani) {
			animal.speak();
		}
	}

}
