fun main() {
    val student1 = Student("Ivan", "Ivanov", "47474747")
    val student2 = Student("Ivan", "Ivanov", "47474747")
  val student3 = student1.copy()
    println(student3)
}


fun listMoves(list: List<Int>) {
    val sum = list.sum()
    val average = list.average()
    val max = list.max()
    val min = list.min()
    val first = list.first()
    val end = list.last()
    println("$sum | $average | $max | $min | $first | $end")
}

inline fun modifidetList(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}

fun modifyString(str: String, mod: (String) -> String): String {
    return mod(str)
}

val number = 23

fun Int.isPure(): Boolean {
    if (this <= 3) {
        return true
    }
    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}

inline fun Employee.inFo() = "Waorker: $name Work ${this.term}"