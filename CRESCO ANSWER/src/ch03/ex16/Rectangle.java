package ch03.ex16;

public class Rectangle {
	private int x;
	private int y;
	private int height;
	private int width;

	public Rectangle(int x, int y, int height, int width){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	public void draw(){
		for(int yPos=0; yPos<y; yPos++){
			System.out.println("");
		}

		for(int yPos=y; yPos<y+height; yPos++){
			for(int xPos=0; xPos<x; xPos++){
				System.out.print(" ");
			}
			for(int xPos=x; xPos<x+width; xPos++){
				System.out.print("*");
			}
			System.out.println("");
		}
	} 
}
