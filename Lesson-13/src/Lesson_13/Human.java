package Lesson_13;

public class Human {
	private int weigh;
	private int height;
	public Human(int weigh, int height) {
		super();
		this.weigh = weigh;
		this.height = height;
	}
	public int getWeigh() {
		return weigh;
	}
	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Human [weigh=" + weigh + ", height=" + height + "]";
	}
	
	

}
