object DataBase {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertDB(str: String) {
        data.add(str)
    }

}