package bot

fun main() {
    val name: String = "Kbot"
    val age: Int = 2022

    println("Hello! My name is $name.")
    println("I was created in $age.")

    println("Please, remind me your name?")
    val userName: String = readLine().toString()
    println("What a great name you have, $userName!")

    println("Let me guess your age.")
    println("Enter reminders of dividing your age by 3, 5 and 7.")
    val reminder3: Int = readLine()!!.toInt()
    val reminder5: Int = readLine()!!.toInt()
    val reminder7: Int = readLine()!!.toInt()
    val ageUser = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105
    println("Your age is $ageUser; that's a good time to start programming!")

    println("Now I will prove to you that I can count to any number you want.")
    val number: Int = readLine()!!.toInt()
    for (i in 0..number) {
        println("$i!")
    }
    println("Completed, have a nice day!")

    println("Let's test your programming knowledge.")
    println("""Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.""")
    var answer = readLine()!!.toInt()
    while (answer == 2) {
        println("Please, try again.")
        answer = readLine()!!.toInt()
    }
    println("Congratulations, have a nice day!")
}
