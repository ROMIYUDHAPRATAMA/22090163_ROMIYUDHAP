/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

/**
 *
 * @author user
 */
public class RubberDuck extends Duck{

    private practice.opp.FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public RubberDuck(){
        FlyNoWay flyBehavior = new FlyNoWay();
        //quackbehavior = new Squeak();
        quackBehavior = () -> System.out.println("Squeak");
        
    }
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    @Override
    public void display(){
        System.out.println("Im a rubber duckie");
    }
}
