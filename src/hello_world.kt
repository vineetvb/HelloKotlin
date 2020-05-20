fun helloList() {
    var list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    println(list3)
}

fun sayHello(input_name: String){
    println("Hello $input_name")
}

fun main(args: Array<String>){
    println("Starting Main")
    helloList()
    sayHello("Vineet")
    sayHello(args[0])

    var hour: Int = args[1].toInt()
    if (hour < 12){
        sayHello(", good morning.")
    }
    else if (hour < 24){
        sayHello(", good evening")
    }
    else {
        sayHello(", sorry what time is it?")
    }


}