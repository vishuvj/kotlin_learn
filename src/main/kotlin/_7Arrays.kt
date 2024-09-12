/* Simple object that store values of same type
*and fixed size*/
fun main() {
    val obj = _7Arrays()
    obj.arrayString()

}

class _7Arrays {

    fun arrayString() {
        // implicit define array
        val arr = arrayOf("Apple", "Samsung", "Lenovo")
        // explicit define array
        val arr2 = arrayOf<Int>(1, 2, 3)
        for (i in arr.withIndex()) {
            println(i)
        }
        println(arr[0])
        println(arr.get(1))
        // to change a specific index value
        arr.set(1, "lava")
        println(arr.get(1))
        println(arr.size)
//        println(arr2)
    }

}