import java.nio.DoubleBuffer;

public class Produto implements Comparable<Produto> {
    private String name;
    private Double price;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Produto p) {
        return name.toUpperCase() .compareTo(p.getName() .toUpperCase());
    }
}
