fun main(args: Array<String>) {
    println("Hello World!")
    var origin = "He11owor1d";
    var replace = "lloWorl";
    var result = origin.replaceRange(IntRange(2, replace.length+1), replace)
    println(result)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}