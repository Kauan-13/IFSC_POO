package ads.poo;

public class Ponto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto ponto) {
        return Math.sqrt((Math.pow((ponto.x - this.x),2) + Math.pow((ponto.y - this.y),2)));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
