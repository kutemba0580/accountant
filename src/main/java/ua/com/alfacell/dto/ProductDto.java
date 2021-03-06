package ua.com.alfacell.dto;

public class ProductDto {
    private Integer id;
    private String nameProduct;
    private String barcode;
    private String brand;
    private String description;
    private CategoryDto categoryDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }


    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", barcode='" + barcode + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", categoryDto=" + categoryDto +
                '}';
    }
}
