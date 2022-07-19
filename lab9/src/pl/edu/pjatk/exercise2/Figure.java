package pl.edu.pjatk.exercise2;

public abstract class Figure {
    protected int[] edges;

    public Figure(int[] edges) {
        this.edges = edges;
    }

    public abstract double getArray();

    public int edgesSum(){
        int sum = 0;
        for (int num: edges) {
            sum += num;
        }
        return sum;
    }
}
