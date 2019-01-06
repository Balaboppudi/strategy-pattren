package com.startagy.demo.behaviour;

public class Duck {

	IQuackBehaviour quackBehaviour;
	IFlyBehaviour flyBehaviour;
	IDisplayBehaviour displayBehaviour;
	public Duck(IQuackBehaviour quackBehaviour, IFlyBehaviour flyBehaviour, IDisplayBehaviour displayBehaviour){
		this.quackBehaviour = quackBehaviour;
		this.flyBehaviour = flyBehaviour;
		this.displayBehaviour = displayBehaviour;
	}
}
