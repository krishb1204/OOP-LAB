public class Animals{
void eat(){
System.out.println("Bark");
}
public static void main(String[] args){
Dog d = new Dog();
d.bark();
d.eat();
}
}
class Dog extends Animals{
void bark(){
System.out.println("Eat");

}
}