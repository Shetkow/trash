class Programmer(name: String, age: Int, var programLang: String) : Worker(name, age), Cleaner {
    override fun work() {
        println("Я пишу на $programLang")
    }

    override fun clean() {
        println("Я убираюсь")
    }
}