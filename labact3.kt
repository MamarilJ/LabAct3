fun main() {
    val age = 23 * 365
    val name = "jan ray"
    val border = "%%%###="
    printBorder(border)
    print("happy bday! $name\n")
    printBorder(border)
    print("i am $age days old\n")
    print("$age is the best age to learn Kotlin!\n")


    //lets print a cake
    println("   ,,,,,   ")
    println("   |   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")

    print("$name is $age years old\n")

}
fun printBorder(border:String){
    val timesToRepeat = 3
    repeat(timesToRepeat){
        print(border)
    }
    println()
}
