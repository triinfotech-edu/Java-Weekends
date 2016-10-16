class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " is " + age + " years old";
	}

	public boolean isGreater(Person person) {
		return age > person.age;
	}

	public static boolean isGreater(Person p1, Person p2) {
		return p1.age > p2.age;
	}
}

class PersonTest {
	public static void main(String[] args) {
		Person ajay = new Person("Ajay", 22);
		Person gagan = new Person("Gagan", 21);

		System.out.println(Person.isGreater(ajay, gagan));
	}
}