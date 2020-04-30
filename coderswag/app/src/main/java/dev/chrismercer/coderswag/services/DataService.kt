package dev.chrismercer.coderswag.services

import dev.chrismercer.coderswag.model.Category
import dev.chrismercer.coderswag.model.Product

object DataService {

    val Categories = listOf(
        Category("DIGITAL", "digitalgoodsimage"),
        Category("HATS", "hatsimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage")
    )

    val hats = listOf(
        Product("Cool hat", "13.99", "hat1"),
        Product("Special hat", "14.99", "hat2"),
        Product("First hat", "15.99", "hat3"),
        Product("Pink hat", "16.99", "hat4")
    )

    val hoodies = listOf(
        Product("Special Hoodie", "33.99", "hoodie1"),
        Product("Black Hoodie", "35.99", "hoodie2"),
        Product("Grey Hoodie", "37.99", "hoodie3"),
        Product("Red Hoodie", "39.99", "hoodie4")
    )

    val shirts = listOf(
        Product("Cool shirt", "9.99", "shirt1"),
        Product("New shirt", "8.99", "shirt2"),
        Product("Well used shirt", "7.99", "shirt3"),
        Product("Pink shirt", "6.99", "shirt4"),
        Product("Clearance shirt", "5.99", "shirt5")
    )
}