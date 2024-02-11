package ex4

fun main() {

    val value = isPrime(5)
    println(value)
}

fun isPrime(num: Int): Boolean {
    println("Enter Prime Number")
    val primeNum = readln().toInt()

    if (primeNum <= 1) {
        return false
    }
    for (i in 2 until primeNum) {
        if (primeNum % i == 0) {
            return false
        }
    }

    return true
}