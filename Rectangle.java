public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public void getWidth() {
        System.out.println(this.width);
    }

    public void setHeight(int value) {
        this.height = value;
    }

    public void getHeight() {
        System.out.println(this.height);
    }

    public void display() {
        for (int i = 0; i <= height - 1; i++) {
            for (int j = 0; j < width - 1; j++) {
                System.out.print("#");
            }
            System.out.println("#");
        }
    }

    public int getArea() {
        System.out.println("Area: " + width * height);
        return width * height;
    }

    public int getPerimeter() {
        System.out.println("Perimeter: " + (width + height) * 2);
        return (width + height) * 2;
    }

}
