package javaAbstraction;



public abstract class GraphicObject {

    protected int x;
    protected int y;

    void moveTo(int newX, int newY) {
    	this.x = newX;
    	this.y=newY;
        System.out.println("Move to x = " + newX + "\nMove to y = " + newY);
    }

    abstract void draw();

    abstract void resize();


   
}
