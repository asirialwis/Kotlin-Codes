package ex2

fun main() {
    println(circumference(5))
}

fun circumference( r:Int): Double {
    val radius = r;
    val cf = 2 * 3.14 * radius;
    return cf
}