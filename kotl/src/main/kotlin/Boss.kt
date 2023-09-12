class Boss(name: String,age:Int):Worker(name, age) {
    override fun work() {
        println("Я руковожу")
    }
}