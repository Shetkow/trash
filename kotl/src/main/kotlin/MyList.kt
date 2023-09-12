interface MyList<T> {
    fun get(index:Int): T?
    fun add(str:T)
    fun remove(element: T)
    fun removeAtIndex(index: Int)
    fun size():Int
}