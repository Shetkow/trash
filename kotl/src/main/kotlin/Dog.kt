class Dog {
    var name: String? = null
        get() {
            return if (field == null) {
                " "
            } else {
                field?.let { it.toLowerCase().capitalize() }
            }
        }
    var age: Int = 0
        set(value) {
            if (value in 0..40) {
                field = value
            }
        }
    var weight: Double = 0.0
        set(value) {
            if (value > 0) {
                field = value

            } else {
                println("не допустимый вес")
            }
        }

}