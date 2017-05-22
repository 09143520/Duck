package test.java;

import org.junit.Test;


import model.java.Duck;
import model.java.FlyNoWay;
import model.java.FlyWithWings;
import model.java.MallarDuck;
import model.java.Quack;
import model.java.QuackBehavior;
import model.java.RubberDuck;
import model.java.Squeak;
public class DuckTest{

 @Test
//Ò°Ñ¼
 public void duckTest(){
    Duck MallardDuck=new MallarDuck();
    MallardDuck.setFlyBehavior(new FlyWithWings());
    MallardDuck.setQuackBehavior(new Quack());
    System.out.println(MallardDuck.display()+MallardDuck.swim());
    System.out.println(MallardDuck.performFly());
    System.out.println(MallardDuck.performQuack());
//Ïð½ºÑ¼
    Duck rubberDuck = new RubberDuck();
    rubberDuck.setQuackBehavior(new Squeak());
    rubberDuck.setFlyBehavior(new FlyNoWay());
    System.out.println(MallardDuck.performFly());
    System.out.println(MallardDuck.performQuack());

}
}

