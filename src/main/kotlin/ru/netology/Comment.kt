package ru.netology

data class Comment (
    val id:Int = 0, //integer идентификатор комментария.
    val fromId: Int = 0, //integer id автора комментария.
    val date: Int = 0, //integer дата создания комментария в формате Unixtime.
    val text: String = "", //string текст комментария.

    val replyToUser: Int = 0, //integer id пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
    val replyToComment: Int = 0, //integer	id комментария, в ответ на который оставлен текущий (если применимо).
    val attachments: Int = 0, //object	медиавложения комментария (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.
    val parentsStack: Array<Int>? = null, //массив id родительских комментариев.
    val thread: Thread = Thread()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (id != other.id) return false
        if (fromId != other.fromId) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyToUser != other.replyToUser) return false
        if (replyToComment != other.replyToComment) return false
        if (attachments != other.attachments) return false
        if (parentsStack != null) {
            if (other.parentsStack == null) return false
            if (!parentsStack.contentEquals(other.parentsStack)) return false
        } else if (other.parentsStack != null) return false
        if (thread != other.thread) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + fromId
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + replyToUser
        result = 31 * result + replyToComment
        result = 31 * result + attachments
        result = 31 * result + (parentsStack?.contentHashCode() ?: 0)
        result = 31 * result + thread.hashCode()
        return result
    }
}