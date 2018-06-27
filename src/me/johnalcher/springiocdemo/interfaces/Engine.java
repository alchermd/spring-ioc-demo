package me.johnalcher.springiocdemo.interfaces;

public interface Engine {
	public void start();
	public boolean connectTo(Wheel[] wheels);
	public void accelerate();
}
