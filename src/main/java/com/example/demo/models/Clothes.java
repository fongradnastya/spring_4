package com.example.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "clothes")
public class Clothes {
    /**
     * Идентификатор предмета
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * Название предмета одежды
     */
    @Size(min = 2, max = 30, message = "len of name is not between 3 and 30")
    @Column(name = "item_name")
    private String name;
    /**
     * Цвет предмета одежды
     */
    @Size(min = 2, max = 30, message = "len of name is not between 3 and 30")
    @Column(name = "color")
    private String color;
    /**
     * Название бренда
     */
    @Size(min = 2, max = 30, message = "len of name is not between 3 and 30")
    @Column(name = "brand")
    private String brand;
    /**
     * Размер одежды
     */
    @Min(value = 0, message = "quantity can not be negative")
    @Column(name = "item_size")
    private int size;
    /**
     * Цена товара
     */
    @Min(value = 0, message = "quantity can not be negative")
    @Column(name = "price")
    private double price;
    /**
     * Число товара
     */
    @Min(value = 0, message = "quantity can not be negative")
    @Column(name = "quantity")
    private int quantity;

    /**
     * Конструктор класса без параметров
     */
    public Clothes(){
        this.name = "Default name";
        this.brand = "";
        this.price = 0;
        this.quantity = 1;
    }

    /**
     * Получает индекс товара
     * @return индекс товара
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает индекс товара
     * @param id индекс товара
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает название предмета
     * @return название предмета
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название предмета одежды
     * @param name название
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает текущий цццвет одежды
     * @return цвет одежды
     */
    public String getColor() {
        return color;
    }

    /**
     * Устанавливает цвет одежды
     * @param color цвет одежды
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Получает бренд одежды
     * @return название бренда
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Устанавливает бренд одежды
     * @param brand название бренда
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Получает размер одежды
     * @return размер одежды
     */
    public int getSize() {
        return size;
    }

    /**
     * Устанавливает размер одежды
     * @param size размер одежды
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Получает текущую цену
     * @return цена товара
     */
    public double getPrice() {
        return price;
    }

    /**
     * Устанавливает цену товара
     * @param price цена товара
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Получает количество товара
     * @return количество
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Устанавливает количество товара
     * @param quantity количество
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Создаёт строковое представление объекта
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return String.format(
                "ID: %d, Название: %s, Цвет: %s, Бренд: %s, Размер: %d, Цена: %.2f ₽, Количество: %d",
                id, name, color, brand, size, price, quantity
        );
    }
}
