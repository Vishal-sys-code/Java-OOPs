## Some Questions [5,7,8]

***Q.1) Do we have copy constructor in java?***

```
There is no explicit copy constructor in Java. However, we can achieve the functionality of a copy constructor in Java by copying the values from one object to another, just like the copy constructor.
    The following are some methods to copy the values from one object to another:
        - By constructor
        - By assigning the values of one object to another
        - By clone() method of Object class
```

***Q.2)  What is constructor chaining. Give atleast one example with program.***

```
Constructor chaining is a sequence of invoking constructors upon initializing an object. 
It is used when we want to invoke a number of constructors, one after another by using only an instance.

In constructor chain, a constructor is called from another constructor in the same class this process is known as constructor chaining. It occurs through inheritance.
When we create an instance of a derived class, all the constructors of the inherited class (base class) are first invoked, after that the constructor of the calling class (derived class) is invoked.

We can achieve constructor chaining in two ways:

- Within the same class: If the constructors belong to the same class, we use this
- From the base class: If the constructor belongs to different classes (parent and child classes), we use the super keyword to call the constructor from the base class.

public class ConstructorChain {  

    //default constructor  
    ConstructorChain() {  
        this("Javatpoint");  
        System.out.println("Default constructor called.");  
    }  

    //parameterized constructor  
    ConstructorChain(String str) {  
        System.out.println("Parameterized constructor called");  
    }  

    //main method  
    public static void main(String args[]) {   
    //initializes the instance of example class  
        ConstructorChain cc = new ConstructorChain();   
    }   

}   
```

***Q.3) Why constructor cannot be final, static, abstract?***

```
We know static keyword belongs to a class rather than the object of a class. A constructor is called when an object of a class is created, so no use of the static constructor. Another thing is that if we will declare static constructor then we can not access/call the constructor from a subclass. Because we know static is allowed within a class but not by a subclass.
When an object of subclass is created then Superclass constructor is called by Subclass constructor through constructor chaining. But if we make superclass constructor static then it can’t be called by Subclass as above said static it is accessible within the class but not by the subclass.

```
