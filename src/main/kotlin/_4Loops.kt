fun main() {
    val _4Loops = _4Loops()
//    _4Loops.whileLoops()
//    _4Loops.table()
//    _4Loops.doWhileLoop()
//    _4Loops.forLoop()
    _4Loops.forLoopStep()
    _4Loops.forLoopDownTo()
}

class _4Loops {
    // while loop it check condition first if then then execute
    fun whileLoops() {
        var count = 5
        while (count >= 1) {
            println("Hello While Loop")
            count--
        }
    }

    fun table() {
        var index = 1
        var number = 2
        while (index <= 10) {
            println("2 X $index: " + number * index)
            index++
        }
    }

    // do while loop it execute first then check condition if true then execute second iteration

    fun doWhileLoop() {
        var index = 5
        do {
            println("Hello do-while loop")

        } while (index > 5)
    }

    // for loop
    fun forLoop() {
        for (i in 1..5) {
            print("Normal forLoop: $i")
        }
    }

    // step
    fun forLoopStep() {
        println("For loop with step") // it count 2 step
        for (i in 1..10 step 2) {
            print(i)
        }
        println()
    }

    // downTo it down the value
    fun forLoopDownTo() {
        println("for loop with downTo")
        for (i in 10 downTo 2 step 2) { // it will down up to 4 or decrement by 2
            print(i)
        }
        println()
    }
}