package com.example.demo;

/**
 * Класс предмета одежды
 */
public class Clothes {
    /**
     * Идентификатор предмета
     */
    private int id;
    /**
     * Название предмета одежды
     */
    private String name;
    /**
     * Цвет предмета одежды
     */
    private String color;
    /**
     * Название бренда
     */
    private String brand;
    /**
     * Размер одежды
     */
    private int size;
    /**
     * Цена товара
     */
    private double price;
    /**
     * Число товара
     */
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
     * Конструктор класса с параметрами
     * @param name название одежды
     * @param color вет одежды
     * @param brand бренд одежды
     * @param size размер одежды
     * @param price цена товара
     * @param quantity количество товара
     */
    public Clothes(String name, String color, String brand, int size, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
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
