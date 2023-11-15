package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Сервис для работы с одеждой
 */
@Service
public class ClothesService {
    /**
     * Объект класса для работы с базой данных
     */
    @Autowired
    private ClothesControl clothesControl;

    /**
     * Добавляет новую одежду
     * @param clothes предме для добавления
     */
    public void addClothes(Clothes clothes) {
        clothesControl.addClothes(clothes);
    }

    /**
     * Возвращает список всех предметов одежды из базы данных
     * @return список одежды
     */
    public List<Clothes> getAllClothes() {
        return clothesControl.getAllClothes();
    }

    /**
     * Обновляет данные о предмете одежды
     * @param id идентификатор предмета
     * @param updatedClothes данные для обновления
     */
    public void updateClothes(Integer id, Clothes updatedClothes) {
        clothesControl.updateClothes(id, updatedClothes);
    }

    /**
     * Удаляет одежду из базы данных по идентификатору.
     * @param id идентификатор одежды для удаления.
     */
    public void deleteClothes(Integer id) {
        clothesControl.deleteClothes(id);
    }

    /**
     * Осуществляет поиск предметов одежды по заданному полю и значению.
     * @param field поле для поиска.
     * @param value значение для поиска.
     * @return список предметов, соответствующих критериям поиска.
     */
    public List<Clothes> searchClothes(String field, String value) {
        return clothesControl.searchClothes(field, value);
    }
}
