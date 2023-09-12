import kotlin.math.sqrt
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val number = 97
   println( number.isPure())
}

fun Int.isPure():Boolean {
if(this <= 3) return true
    for(i in 3..this/2) {
        if (this % i == 0) {
            return false
        }
    }
    return true


}
















