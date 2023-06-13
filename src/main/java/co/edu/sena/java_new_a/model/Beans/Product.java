package co.edu.sena.java_new_a.model.Beans;

public class Product {

    private Integer id_product;
    private String name_product;
    private String value_product;


    public Product() {
    }

    public Product(Integer id_product, String name_product, String value_product) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.value_product = value_product;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getValue_product() {
        return value_product;
    }

    public void setValue_product(String value_product) {
        this.value_product = value_product;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", name_product='" + name_product + '\'' +
                ", value_product=" + value_product +
                '}';
    }
}
