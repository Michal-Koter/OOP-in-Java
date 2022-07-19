package pl.edu.pjatk.circle;

public class Circle2D {

        private double x;
        private double y;
        private double radius;

        public Circle2D() {
            this.x = 0;
            this.y = 0;
            this.radius = 1;
        }

        public Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius/2;
        }

        public double getArea(){
            return (Math.PI*this.radius*this.radius);
        }

        public double getPerimeter(){
            return (2*Math.PI*this.radius);
        }

}
