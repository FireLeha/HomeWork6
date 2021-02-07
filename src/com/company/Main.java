package com.company;

public class Main {
	static int catCount = 0;
	static int dogCount = 0;
	public static void main(String[] args) {
		Cat cat1 = new Cat("Нано",200, 0);
		catCount++;
		Dog dog1 = new Dog("Свити", 500,10);
		dogCount++;
		cat1.run(150);
		cat1.swim(5);
		dog1.run(200);
		dog1.swim(7);

		System.out.println("Количество кошек: " + catCount);
		System.out.println("Количество собак: " + dogCount);
	}
}
