package com.wcl.kotlindemo.generic

interface Book

interface EduBook : Book

class BookStore {

    fun getBook(): Book {
        TODO()
    }
}

class BookStore2<T> {

    fun getBook(): T {
        TODO()
    }
}

class BookStore3<out T : Book> {

    fun getBook(): T {
        TODO()
    }
}

//class BookStore3< T : Book> {
//
//    fun getBook(): T {
//        TODO()
//    }
//}

fun main() {


    val eduBookStore: BookStore3<EduBook> = BookStore3<EduBook>()
    val bookStore: BookStore3<Book> = eduBookStore

    val book:EduBook = eduBookStore.getBook()
    val book2:Book = bookStore.getBook()
}


