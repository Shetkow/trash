open class SportMan {
    fun callWaterMan(waterMan: WaterMan){
        waterMan.btingWater()
    }
    inline fun callWaterMan(bringWater:() -> Unit){
        bringWater()
    }
}