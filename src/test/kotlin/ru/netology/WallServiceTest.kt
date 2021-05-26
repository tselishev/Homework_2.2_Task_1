package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addNotZero() {
        val post = Post(0)
        WallService.add(post)
        assertEquals(3, WallService.posts.last().id)
    }

    @Test
    fun updateTrue() {
        WallService.add(Post())
        val post = Post(id = 1)
        val result = WallService.update(post)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.add(Post())
        val post = Post(10)
        val result = WallService.update(post)
        assertFalse(result)
    }

}