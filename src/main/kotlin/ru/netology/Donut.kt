package ru.netology

data class Donut(
    var isDonut: Boolean = false, // — запись доступна только платным подписчикам VK Donut;
    var paidDuration: Int = 0, // — время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    var placeholder: Object = Object(), //  — заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
    var canPublishFreeCopy: Boolean = false, // — можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    var editMode: String = "", // — информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    var all: String = "всю информацию о VK Donut.",
    var duration: String = "время, в течение которого запись будет доступна только платным подписчикам VK Donut.",
)