import java.time.LocalDate
import java.util.Calendar

class Employee(var name: String, var jobTitle: String, var termOfWork: Int) {
    fun getInfo() {
        println("Имя $name Должность $jobTitle год начала работы  $termOfWork")
    }

    val startAfter2000
        get() = termOfWork >= 2000

    fun work() = println("Work... ")
    val term: Int
        get() = LocalDate.now().year - termOfWork
}