/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay28thang8;

/**
 *
 * @author lamit
 */

//abstract class
public abstract class ClassA {
    //abstract function
    abstract void doSomething();
    abstract void eatSomething();

}
//alt enter
class ClassB extends ClassA{

    @Override
    void doSomething() {
        System.out.println("Learn Code");
    }

    @Override
    void eatSomething() {
        System.out.println("An kieu Viet nam");
    }
    
}
class ClassC extends ClassA{

    @Override
    void doSomething() {
        System.out.println("Play Game");
    }

    @Override
    void eatSomething() {
        System.out.println("An kieu TQ");
    }
    
}