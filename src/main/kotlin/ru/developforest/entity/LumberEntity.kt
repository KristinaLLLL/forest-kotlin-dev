package ru.developforest.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test_1")
class LumberEntity (
    val _date: String = "-",
    val height: Int = 0,
    val width: Int = 0,
    val _length: Double = 0.0,
    val quantity: Int = 0,
    val found: String = "-"
        ) {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int? = null
}