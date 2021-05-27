package aExamplets


fun main() {

    "hello".print()

    val suitIntRange: IntRange = 1..4

    daveForEach1(suitIntRange) {
        println(it)
    }

    daveForEach1(ir = suitIntRange, l = { println(it) })


}

fun daveForEach1(ir: IntRange, l: (i: Int) -> Unit) {
    for (i in ir) {
        l(i)
    }
}


fun IntRange.daveForEach2(l: (i: Int) -> Unit) {
    for (i in this) {
        l(i)
    }
}

fun String.print(){
    println(this.uppercase())
}

fun Int.print(){
    println(this + this * 3)
}
