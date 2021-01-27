package com.example.shymko_hw_lesson17_270121_constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/*
    Описати FamilyTree у layout file в ConstraintLayout.
Повинен бути layout.xml файл в корені якого знаходиться ConstraintLayout
у якому описана структура з іменами (TextViews) у вигляді дерева родини не менше 17 вершин.
Зверху знаходиться корінь дерева. Глубина дерева 4-6 елементів.
Для зручності можна використати горизонтальний режим екрану.
Рівень вложеності view має дорівнювати одиниці.*/


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onStart()
    }
}