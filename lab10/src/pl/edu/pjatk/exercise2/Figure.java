package pl.edu.pjatk.exercise2;

public interface Figure extends Comparable{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    int compareTo(Object o);
}
