import kotlin.random.Random

class Rand {
    companion object {
        const val monday = "Monday"
        const val saturday = "Saturday"
        fun returnRandomInt(from: Int, to: Int) = (from..to).random()
        fun returnRandomBolean(): Boolean {
            var nextBoolean = Random.nextBoolean()
            return nextBoolean
        }

        fun returnRandomWeekDay(): String {
            val index = returnRandomInt(0, 100)
            return when {
                index % 2 == 0 -> {
                    monday
                }

                else -> {
                    saturday
                }
            }
        }
    }
}