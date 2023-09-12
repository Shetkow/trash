class Car(override var name: String) : Transport(name) {
    override fun drive() {
        println("я еду нв машине")
    }

    fun startEngine(canStart: Boolean): Boolean {
        return if (canStart) {
            println("двигатель запущен")
            true
        } else {
            println("двигатель не запущен")
            false
        }
    }
}