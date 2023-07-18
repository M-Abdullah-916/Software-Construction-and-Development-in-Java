package Interface;

public class TestAnimals {
	
	public static void main(String[] args)
	{
		Fish fishMain = new Fish(0,"Bringle");
		Cat catMain = new Cat(4,"Dudu");
		Animal animalFish = new Fish(0,"Bringle");
		Animal animalSpider = new Spider(8);
		pet petMain = new Cat(4,"Dudu");
		
		System.out.println("\nExecuting Part A");
		fishMain.eat();
		fishMain.play();
		
		catMain.eat();
		catMain.play();
		
		animalFish.eat();
		
		animalSpider.eat();
		
		petMain.play();

		System.out.println("\nExecuting Part B\n");
		Animal fishInheritance = new Fish(0,"Bringle");
		Animal spiderInheritance = new Spider(8);
		pet petInheritance = new Cat(4,"Dudu");
		
		((Fish) fishInheritance).eat();
		((Spider) spiderInheritance).eat();
		((Cat) petInheritance).eat();
		
		
	}

}
