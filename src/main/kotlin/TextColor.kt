enum class ConsoleColor(val code: String) {
    RED("\u001B[31m"), // Gibt den Text in der Konsole in Rot aus
    GREEN("\u001B[32m"), // Gibt den Text in der Konsole in Grün aus
    YELLOW("\u001B[33m"), // Gibt den Text in der Konsole in Gelb aus
    BLUE("\u001B[34m"), // Gibt den Text in der Konsole in Blau aus
    RESET("\u001B[0m") // setzt die Textfarbe zurück!
}

fun printlnColored(text: String, color: ConsoleColor) {
    println("${color.code}$text${ConsoleColor.RESET.code}")
}

//fun uebergabeDifficulty(){
//
//}