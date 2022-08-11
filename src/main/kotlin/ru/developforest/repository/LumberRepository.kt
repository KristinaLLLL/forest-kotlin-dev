package ru.developforest.repository

import org.springframework.data.repository.CrudRepository
import ru.developforest.entity.LumberEntity

interface LumberRepository: CrudRepository<LumberEntity, Int> {
}