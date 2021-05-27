package aExamplets


fun main(args: Array<String>) {

    val c0 = Card(1, 1)              //1 point
    val c1 = Card(13, 4)             //10 points
    val c2 = Card(11, 1)             //10 points
    val c3 = Card(3, 4)              //10 points

    fun listDemo() {
        val a1: List<Card> = listOf(c0, c1)
        check(a1.size == 2)

        val a2 = a1 + c2
        check(a2.size == 3)

        val a3 = a2 + c3
        check(a3.size == 4)
    }

    fun mutableListDemo() {
        val a1: MutableList<Card> = mutableListOf(c0, c1)
        check(a1.size == 2)

        a1.add(c2)
        check(a1.size == 3)

        a1.add(c3)
        check(a1.size == 4)
    }


    listDemo()
    mutableListDemo()

}