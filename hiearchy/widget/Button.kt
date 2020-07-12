package ru.netology.hiearchy.widget

import ru.netology.hiearchy.view.TextView

class Button(button: String, text: String = "") : TextView(text) {
    fun button (a :String) {
    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text(a)) // Click me
    button.text("Don't click me")
    println (button.text(a)) // Don't click me
}}