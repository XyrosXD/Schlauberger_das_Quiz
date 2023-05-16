class Quiz(private val questions: List<Question>) {
    fun start() {
        var points = 0
        val answers = mutableListOf<Answer>()
        var currentPlayer = 0 // Variable für den aktuellen Spieler
        for ((index, question) in questions.withIndex()) {
            val currentPlayerName = players[currentPlayer].toString() // Spielername abrufen
            println("Aktueller Spieler: $currentPlayerName") // Aktuellen Spieler anzeigen
            println("Frage ${index + 1}: ${question.text}")
            for (option in question.options) {
                println("\t$option")
            }
            print("Ihre Antwort: ")
            val answer = readLine()!!.uppercase()[0]
            answers.add(Answer(question, answer))
            if (answer == question.correctOption) {
                points++
                println("Richtig!")
            } else {
                println("Falsch!")
            }
            currentPlayer = (currentPlayer + 1) % players.size // Zum nächsten Spieler wechseln
        }
        println("Sie haben $points von ${questions.size} Fragen richtig beantwortet.")
    }
}
