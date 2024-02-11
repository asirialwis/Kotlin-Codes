package ex3


fun studentGrade() {
    println("Enter student mark")
    val markInput = readln().toDouble()

    if (markInput > 75) {
        println("Grade is A")
    } else if (markInput >= 65) {
        println("Grade is B")
    } else if (markInput >= 55) {
        println("Grade is C")
    } else {
        println("Your are fail")
    }

}

fun main() {
    studentGrade()
}

