package com.example.restfulPet.service

import com.example.restfulPet.model.Client
import com.sun.org.apache.xpath.internal.operations.Bool

interface ClientService {
    /**
     * Создает нового клиента
     * @param client - клиент для создания
     */
    fun create(client: Client);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    fun readall(client: Client): List<Client>;

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    fun read(id: Int): Client;

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param client - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    fun update(client: Client, id: Int): Boolean;

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
     fun delete(id: Int): Boolean;
}
