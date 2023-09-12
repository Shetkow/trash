import java.util.Arrays
import java.util.Random

fun main() {
    val data = mapOf<String, List<Int>>(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)

    )
printInfo(data)
}
fun printInfo(data:Map<String,List<Int>>){
    val validateData = data.filterNot { it.value.any{it < 0} }
    val averageWeek = validateData.flatMap { it.value }.average()
    println("Средняя выручка за неделю $averageWeek")
    val listOfSum = validateData.map{it.value.sum()}
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageOfMounth = listOfSum.average()
    val maxMounth = validateData.filter { it.value.sum() == max }.keys
    val minMounth = validateData.filter { it.value.sum() == min }.keys
    println("Средняя выручка в месяц $averageOfMounth")
    println("максимальная выручка в меся $max")
    println("была в следующих месяцах: ")
    for(mounth in maxMounth){
        print("$mounth")
    }

    println()
    println("минимальная выручка в месяц $min")
    println("была в следующих месяцах: ")
    for(mounth in minMounth){
        print("$mounth")
    }
    val invalidateData = data.filter { it.value.any{it < 0} }
    val errMounth = invalidateData.keys
    for(mounth in errMounth){
        println()
        println("ошибки были в $mounth")
    }
}











