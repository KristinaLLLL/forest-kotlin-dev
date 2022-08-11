package ru.developforest.service.impl

import org.springframework.stereotype.Service
import ru.developforest.dto.LumberDto
import ru.developforest.entity.LumberEntity
import ru.developforest.repository.LumberRepository
import ru.developforest.service.LumberService
@Service
class LumberServiceImpl(
    private val lumberRepository: LumberRepository
) : LumberService {
    override fun getAll(): List<LumberDto> {
        return lumberRepository.findAll().map{
            LumberDto(
                _date = it._date,
                height = it.height,
                width = it.width,
                _length = it._length,
                quantity = it.quantity,
                found = it.found
            )
        }
    }
}