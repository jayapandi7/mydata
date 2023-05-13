package org.hardware;

public class Desktop implements Hardware, Software{

	@Override
	public void softwareResources() {
		System.out.println("AMD");
		
	}
	public void ios() {
		System.out.println("mac");

	}

	@Override
	public void hardwareResources() {
		System.out.println("intel");
	}
	public void desktopModel() {
		System.out.println("LED");
	}
	public static void main(String[] args) {
		Desktop d =new Desktop();
		d.softwareResources();
		d.hardwareResources();
		d.desktopModel();
		d.ios();
	}

}
