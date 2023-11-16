package com.example.demo.services;

import com.example.demo.models.Clothes;
import com.example.demo.repository.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Сервис для работы с мебелью.
 */
@Service
@Transactional(readOnly = true)
public class ClothesService {
    private final ClothesRepository repository;

    /**
     * Конструктор для внедрения зависимости репозитория мебели.
     *
     * @param repository Репозиторий мебели.
     */
    @Autowired
    public ClothesService(ClothesRepository repository) {
        this.repository = repository;
    }

    /**
     * Получает все записи мебели.
     *
     * @return Список мебели.
     */
    public List<Clothes> findAll() {
        return repository.findAll();
    }

    /**
     * Находит мебель по идентификатору.
     *
     * @param id Идентификатор мебели.
     * @return Найденная мебель или null, если мебель не найдена.
     */
    public Clothes findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Сохраняет новую запись мебели.
     *
     * @param clothes Объект мебели для сохранения.
     */
    @Transactional
    public void save(Clothes clothes) {
        repository.save(clothes);
    }

    /**
     * Обновляет информацию о мебели.
     *
     * @param id        Идентификатор мебели.
     * @param clothes Объект мебели для обновления.
     */
    @Transactional
    public void update(int id, Clothes clothes) {
        clothes.setId(id);
        repository.save(clothes);
    }

    /**
     * Удаляет мебель по идентификатору.
     *
     * @param id Идентификатор мебели для удаления.
     */
    @Transactional
    public void delete(int id) {
        repository.deleteById(id);
    }

    /**
     * Проверяет отсутствие мебели в базе данных по идентификатору.
     *
     * @param id Идентификатор мебели для проверки.
     * @return true, если мебель отсутствует, иначе false.
     */
    public boolean doesNotExist(int id) {
        return !repository.existsById(id);
    }

    /**
     * Фильтрует мебель по имени.
     *
     * @param name Имя для фильтрации мебели.
     * @return Список мебели, соответствующей заданному имени.
     */
    public List<Clothes> filterByName(String name) {
        return repository.findByNameContains(name);
    }

}
