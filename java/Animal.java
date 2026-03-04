public class Animal{
	

public static void main(String[] args){
Animal a = new Animal();
Mammal m = new Mammal();
Dog d = new Dog();

System.out.println(m instanceof Animal);
System.out.println(d instanceof Animal);
System.out.println(d instanceof Mammal);
System.out.println(a instanceof Mammal);
}
}

class Mammal extends Animal{
}
class Dog extends Mammal{
}





