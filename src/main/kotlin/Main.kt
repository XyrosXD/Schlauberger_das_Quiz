val players = mutableListOf<Player>() // Liste der Spieler

fun main() {
    Spieler(name = "Quizmaster").fusionOpening() // Einleitungstext
    println()

    println("Willkommen zum #-Schlauberger-# Quiz!")
    println("Wählen Sie die Anzahl der Spieler aus (1-4)")

    val numberOfPlayers = readLine()!!.toInt()
    for (i in 1..numberOfPlayers) {
        println("Geben Sie den Namen von Spieler $i ein:")
        val playerName = readLine()!!
        players.add(Player(playerName)) // Spieler zur Liste hinzufügen
    }

    println("Bitte wählt euren Schwierigkeitsgrad aus.")
    println("1: Einfach")
    println("2: Mittel")
    println("3: Schwer")

    val difficulty = readLine()!!.toInt()
//    uebergabeDifficulty(difficulty)
    when (difficulty) {
        1 -> {
            println("Ihr habt euch für die einfachen Fragen entschieden")
            println("Los gehts 🎉")
            Quiz(EasyQuestions.questionsEasy.shuffled(),10).start() // Start des Quiz mit einfachen Fragen
        }
        2 -> {
            println("Ihr habt euch für die mittelschweren Fragen entschieden")
            println("Los gehts 🎉")
            Quiz(MediumQuestions.questionsMedium.shuffled(),10).start() // Start des Quiz mit mittelschweren Fragen
        }
        3 -> {
            println("Ihr habt euch für die schweren Fragen entschieden")
            println("Los gehts 🎉")
            Quiz(HardQuestions.questionsHard.shuffled(),10).start() // Start des Quiz mit schweren Fragen
        }
        else -> {
            println("Die Eingabe war ungültig bitte versuche es noch einmal!!") // Ungültige Eingabe
            return
        }
    }
}



