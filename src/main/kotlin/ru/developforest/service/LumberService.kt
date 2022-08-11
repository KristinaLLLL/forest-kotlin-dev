package ru.developforest.service

import ru.developforest.dto.LumberDto

interface LumberService {
    fun getAll(): List<LumberDto>
}