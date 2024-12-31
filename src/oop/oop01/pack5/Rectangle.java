package oop.oop01.pack5;

public class Rectangle {
	
	private int width;
	private int height;
	private int area;
	
	   // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width * height;  // 면적 계산하여 저장
    }


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	

	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}
}
