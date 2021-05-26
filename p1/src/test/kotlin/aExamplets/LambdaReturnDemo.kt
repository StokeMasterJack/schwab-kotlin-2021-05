package aExamplets

import kotlin.test.Test
import kotlin.test.assertEquals


fun computeInt(): Int {
    val x = 1
    val y = 1
    return x + y
}

val l = {
    val x = 2
    val y = 3
    x + y
}


fun main() {
    println(l())
    println(computeInt())
}


fun doubleIt(l: () -> Int): Int {
    val lRet = l()
    return lRet + lRet
}


fun daveSumArg(numbers: List<Int>): Int {
    var t = 0
    for (i in numbers) {
        t += i
    }
    return t
}

fun List<Int>.daveSum(): Int {
    var t = 0
    for (i in this) {
        t += i
    }
    return t
}


fun <T> List<T>.daveSumOf(l: (c: T) -> Int): Int {
    var t = 0
    for (el in this) {
        t += l(el)
    }
    return t
}


data class User(
    val userName: String,
    val netWorth:Int
)

val c0 = Card1(1, 1)
val c1 = Card1(13, 4)

val u0 = User("fred",100)
val u1 = User("joe",200)

val numbers: List<Int> = listOf(1, 2, 3)
val cards: List<Card1> = listOf(c0, c1)
val users: List<User> = listOf(u0, u1)

class LambdaReturnDemo {

    @Test
    fun testSumUsers() {
        val sum1 = users.daveSumOf { it.netWorth }
        val sum2 = users.sumOf { it.netWorth }
        assertEquals(sum1, sum2)
    }

    @Test
    fun testSumCards() {
        val sum1 = cards.daveSumOf { it.points }
        val sum2 = cards.sumOf { it.points }
        assertEquals(sum1, sum2)
    }

    @Test
    fun testSumInts() {
        val sum1 = numbers.daveSum()
        val sum2 = numbers.sum()
        assertEquals(sum1, sum2)
    }
}