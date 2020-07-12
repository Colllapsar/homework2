package ru.netology.hiearchy.view

open class TextView(text :String) :View() {
    open fun text(s: String) {
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text(s)) // Some Text
    text.text ("Something bad happened")
    println(text.text(s)) // Something bad happened
}}