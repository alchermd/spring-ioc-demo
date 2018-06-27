package me.johnalcher.springiocdemo;

import me.johnalcher.springiocdemo.interfaces.Engine;
import me.johnalcher.springiocdemo.interfaces.Wheel;

public class Car {
	private Engine engine;
	private Wheel[] wheels;
	
	public Car(Engine engine, Wheel[] wheels) {
		this.engine = engine;
		this.wheels = wheels;
	}
	
	public void drive() {
		engine.start();
		engine.connectTo(wheels);
		engine.accelerate();
	}
}
