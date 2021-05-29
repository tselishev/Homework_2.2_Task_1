package ru.netology

abstract class Attachments {
    abstract val type: String

}

class VideoAttachments : Attachments() {
    override val type: String = "video"
    val video: Video = Video()
}

class Video {
    val id: Int = 0 // - видентификатор фотографии.
    val albumId: Int = 0 // - идентификатор альбома, в котором находится фотография.
    val ownerId: Int = 0 // - идентификатор владельца фотографии.
    val userId: Int = 0 // - идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String = "" // - текст описания фотографии.
    val date: Int = 0
}

class AudioAttachments : Attachments() {
    override val type: String = "audio"
    val audio: Audio = Audio()
}

class Audio {
    val id: Int = 0 //	идентификатор аудиозаписи.
    val ownerId: Int = 0 //	идентификатор владельца аудиозаписи.
    val artist: String = ""// исполнитель.
    val title: String = "" // название композиции.
    val duration: Int = 0 //  длительность аудиозаписи в секундах.
    val url: String = ""  //	ссылка на mp3.
    val lyricsId: Int = 0//	идентификатор текста аудиозаписи (если доступно).
    val albumId: Int = 0 //	идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genreId: Int = 0 // идентификатор жанра из списка аудио жанров.
    val date: Int = 0 // дата добавления.
    val no_search: Int = 0// 1 ecли включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val is_hq: Int = 0 //	1, если аудио в высоком качестве.
}

class LinkAttachments : Attachments() {
    override val type: String = "link"
    val link: Link = Link()
}

class Link{
    val url: String = "" //	URL ссылки.
    val title:String = "" //   string	заголовок ссылки.
    val caption: String = "" //  string	подпись ссылки (если имеется).
    val description:String = "" //   string	описание ссылки.
    val preview_page: String = "" //  string	идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val preview_url: String = "" //  string	URL страницы с контентом для предпросмотра содержимого страницы.

}


class NoteAttachments : Attachments() {
    override val type: String = "note"
    val note: Note = Note()
}

class  Note {
    val id: Int = 0 //   integer    идентификатор заметки.
    val ownerId: Int = 0 //    integer    идентификатор владельца заметки.
    val title:String = "" //   string    заголовок заметки.
    val text: String = "" //   string    текст заметки.
    val date: Int = 0 //   integer    дата создания заметки в формате Unixtime.
    val comments: Int = 0 //    integer    количество комментариев.
    val readComments: Int = 0 //    integer    количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val viewUrl: String = "" // string    URL страницы для отображения заметки.
}

class PhotoAttachments : Attachments() {
    override val type: String = "photo"
    val photo: Photo = Photo()
}

class Photo{

    val id: Int = 0 //   integer	идентификатор фотографии.
    val albumId:Int = 0 //  integer	идентификатор альбома, в котором находится фотография.
    val ownerId:Int = 0 //  integer	идентификатор владельца фотографии.
    val userId:Int = 0 //   integer	идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String = "" //   string	текст описания фотографии.
    val date: Int = 0 //  integer	дата добавления в формате Unixtime.
}