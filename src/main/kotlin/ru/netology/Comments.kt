package ru.netology

data class Comments(                  //object  информация о комментариях к записи, объект с полями:
    val count: Int = 0,                //(integer) — количество комментариев
    val canPost: Boolean = false,         //* (integer, [0,1]) — информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может)
    val groupsCanPost: Boolean = false,  //(integer, [0,1]) — информация о том, могут ли сообщества комментировать запись
    val canClose: Boolean = false,      // — может ли текущий пользователь закрыть комментарии к записи

)