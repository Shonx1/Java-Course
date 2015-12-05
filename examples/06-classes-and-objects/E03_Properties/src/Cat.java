
public class Cat {

	private String name;
	private String breed;
	private int age;
	
	public Cat(){
		this.name = "";
		this.breed = "";
		this.age = 0;
	}
	
	public Cat(String name, String breed, int age){
		this();
		
		setName(name);
		setBreed(breed);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null){
			this.name = name;
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		if(breed != null){
			this.breed = breed;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 0){
			this.age = age;
		}
	}
	
	public void sayMiau(boolean identify){
		System.out.println("Miauuuuuu Myrrrrr!");
		
		if(identify){
			sayName();
			sayBread();
			sayAge();
		}
	}
	
	private void sayName(){
		System.out.println("My pretty name is " + this.name);
		

	}
	
	private void sayBread(){
		System.out.println("The best breed in the world is mine : " + this.breed);
	}
	
	private void sayAge(){
		System.out.println("I am young lady at " + this.age);
	}
}
