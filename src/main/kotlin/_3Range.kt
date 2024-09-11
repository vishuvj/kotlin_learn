fun main(){
    val number=10
    val result =number in 1..5
    println(result)
    val result2=number in 1..10
    println(result2)

    val untilResult=number in 1 until 5
    println(untilResult)

    // kotlin range in character
    for(ch in 'a'..'d'){
        print(ch)
    }
    println()
    // step fun
    for(n in 1..10 step 2){
        print(n)
    }
    println()
    for(num in (1..5).reversed()){
        print(num)
    }
    println()

    // until
    // it skip the last element
    for (n in 1 until 5){
        print(n)
    }
    println()

    // first and last step element
    println("first step: "+(5..10).first)
    println("step count: "+(5..10 step 2).step)
    println("last step: "+(5..10).reversed().last)


    // filtering ranges
    val a =1..10
    val f=a.filter { T -> T % 2==0 }
    println(f)

    // distinct => it remove the duplicate value
    val z=listOf(1,1,2,2,3,4,5,6,7,7,9,10)
    println(a.distinct())
    println("min: "+a.min())
    println("max: "+a.max())
    println("sum: "+a.sum())
    println("count: "+a.count())
    println("average: "+a.average())

}