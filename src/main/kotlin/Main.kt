fun main(args: Array<String>) {

    val players = mutableListOf<Player>()

    println("Willkommen zum #-Schlauberger-# Quiz!")
    println("Wählen Sie die Anzahl der Spieler aus (1-4)")
    val numberOfPlayers = readLine()!!.toInt()
    for (i in 1..numberOfPlayers) {
        println("Geben Sie den Namen von Spieler $i ein:")
        val playerName = readLine()!!
        players.add(Player(playerName))
    }

    println("Bitte wählt euren Schwierigkeitsgrad aus.")
    println("1: Einfach")
    println("2: Mittel")
    println("3: Schwer")

    val difficulty = readLine()!!.toInt()
    when (difficulty) {
        1 -> {
            Quiz(EasyQuestions.questionsEasy.shuffled()).start()
            println("Ihr habt euch für die einfachen Fragen entschieden")
            println("Los gehts 🎉")
        }
        2 -> {
            Quiz(MediumQuestions.questionsMedium.shuffled()).start()
            println("Ihr habt euch für die mittelschweren Fragen entschieden")
            println("Los gehts 🎉")
        }
        3 -> {
            Quiz(HardQuestions.questionsHard.shuffled()).start()
            println("Ihr habt euch für die schweren Fragen entschieden")
            println("Los gehts 🎉")
        }
        else -> {
            println("Die Eingabe war ungültig bitte versuche es noch einmal!!")
            return
        }
    }
}



