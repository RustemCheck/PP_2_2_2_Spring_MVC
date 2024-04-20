package web.Model;

public class Car {
    private String name;
    private String color;
    private int yearOfIssue;

    public Car(String name, String color, int yearOfIssue) {
        this.name = name;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", yearOfIssue=" + yearOfIssue +
               '}';
    }
}
