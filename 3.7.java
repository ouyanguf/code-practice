import java.util.LinkedList;

abstract class Animal{
    public int order;
    public String name;
    public Animal(String n){
        this.name = n;
    }
}

class Dog extends Animal{
    public Dog(String n){
        super(n);
    }
}

class Cat extends Animal{
    public Cat(String n){
        super(n);
    }
}

class AnimalQueue{
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();

    int order = 0;

    public void enqueue(Animal a){
        order++;
        a.order = order;
        if( a instanceof Dog)
            dogs.addLast((Dog)a);
        else
            cats.addLast((Cat)a);
    }

    public Animal dequeueAny(){
        if(dogs.isEmpty())
            return cats.poll();
        else if(cats.isEmpty())
            return dogs.poll();
        if(dogs.peek().order>cats.peek().order){
            return cats.poll();
        }else
            return dogs.poll();
    }

    public Dog dequeueDog(){
        return dogs.poll();
    }

    public Cat dequeueCat(){
        return cats.poll();
    }
}

