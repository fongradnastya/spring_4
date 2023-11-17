package com.example.demo.services;

import com.example.demo.models.Clothes;
import com.example.demo.repository.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Сервис для работы с предметами одежды
 */
@Service
@Transactional(readOnly = true)
public class ClothesService {
    private final ClothesRepository repository;

    /**
     * Конструктор для внедрения зависимости репозитория одежды
     * @param repository Репозиторий с предметами одежды
     */
    @Autowired
    public ClothesService(ClothesRepository repository) {
        this.repository = repository;
    }

    /**
     * Получает все записи о предметах одежды
     *
     * @return Список предметов одежды
     */
    public List<Clothes> findAll() {
        return repository.findAll();
    }

    /**
     * Находит предметы одежлы по идентификатору
     *
     * @param id Идентификатор товара
     * @return Найденный предмет одежды или null
     */
    public Clothes findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Сохраняет новую запись о предмете одежды
     *
     * @param clothes Предмет одежды для сохранения.
     */
    @Transactional
    public void save(Clothes clothes) {
        repository.save(clothes);
    }

    /**
     * Обновляет информацию о предмете одежды
     *
     * @param id        Идентификатор предмета
     * @param clothes Предмет одежды для обновления
     */
    @Transactional
    public void update(int id, Clothes clothes) {
        clothes.setId(id);
        repository.save(clothes);
    }

    /**
     * Удаляет предмет одежды по идентификатору
     *
     * @param id Идентификатор предмета для удаления
     */
    @Transactional
    public void delete(int id) {
        repository.deleteById(id);
    }

    /**
     * Проверяет предмета одежды в базе данных по идентификатору
     * @param id Идентификатор предмета одежды для проверки
     * @return true, если предмет одежды отсутствует, иначе false.
     */
    public boolean doesNotExist(int id) {
        return !repository.existsById(id);
    }

    /**
     * Фильтрует предметы одежды по имени
     * @param name Имя для фильтрации одежды
     * @return Список предметов одежды, соответствующей заданному имени.
     */
    public List<Clothes> filterByName(String name) {
        return repository.findByNameContains(name);
    }

}
