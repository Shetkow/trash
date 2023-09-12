class Adress(var city: String, var street: String, var houseNumber: Int) {
    fun copy(city: String = this.city, street: String = this.street, houseNumber: Int = this.houseNumber): Adress {
        return Adress(city, street, houseNumber)
    }
    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = houseNumber
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Adress

        if (city != other.city) return false
        if (street != other.street) return false
        return houseNumber == other.houseNumber
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + houseNumber
        return result
    }

}