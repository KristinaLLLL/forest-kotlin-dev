package ru.developforest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.developforest.dto.LumberDto
import ru.developforest.service.LumberService

@RestController
@RequestMapping("/lumber")
class LumberController(
    private val lumberService: LumberService,
) {
    @GetMapping
    fun getAll(): List<LumberDto> = lumberService.getAll()
}