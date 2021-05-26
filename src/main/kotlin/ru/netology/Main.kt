package ru.netology

fun main() {

    val origin1 = Post(
        ownerId = 1,
        date = 1113213213,
        text = "Отлично"
    )
    val origin2 = Post(
        ownerId = 2,
        date = 1113213214,
        text = "Хорошо"
    )
    val origin3 = Post(
        2,
        ownerId = 5,
        date = 1113213215,
        text = "Очень хорошо"
    )


    WallService.add(origin1)
    WallService.add(origin2)
    WallService.update(origin3)

    println("Вывод содержимого: ")
    println(WallService.posts.toList())


}