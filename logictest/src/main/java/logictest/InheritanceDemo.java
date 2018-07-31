package logictest;

import java.awt.event.WindowEvent;

class Box {
	double width, height, depth;

	Box() {
		width = 1;
		height = 1;
		depth = 1;
	}

	Box(Box box) {
		width = box.width;
		height = box.height;
		depth = box.depth;
	}
	double volume() {
		return width*height*depth;
	}
}

class WeightBox extends Box {
	double weight;

	WeightBox(double w, double h, double d, double wght) {
		width = w;
		height = h;
		depth = d;
		weight = wght;

	}

}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeightBox  weightBox1 = new WeightBox(10, 15, 20, 2.5);
		Box plainBox = new Box();
		
		plainBox = weightBox1;
		System.out.println(plainBox.volume());

	}

}
