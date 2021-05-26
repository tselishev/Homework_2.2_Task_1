package ru.netology

//создание синглтона - Объект WallService, который внутри себя хранит посты в массиве
object WallService {
    // val posts = emptyArray<Post>()
    val posts: ArrayList<Post> = arrayListOf()

    fun add(post: Post): Post {
        val postNew = if (posts.isEmpty()) post.copy(id = 1)
        else post.copy(id = posts.last().id + 1)
        posts += postNew
        return posts.last()
    }


    fun update (newPost: Post):Boolean{
        for ((index, post) in posts.withIndex()) {

            if (post.id == newPost.id) {
                newPost.ownerId = post.ownerId
                newPost.date = post.date
                posts[index] = newPost
                return true
            }
        }
        return false
    }

}