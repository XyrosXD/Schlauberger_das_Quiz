import kotlin.concurrent.thread

class Quiz(private val questions: List<Question>, private val numQuestions: Int) : Player(name = readln()) {
    fun start() {

        val answers = mutableListOf<Answer>()
        var currentPlayer = 0 // Variable für den aktuellen Spieler
        val numQuestionsToPlay = minOf(numQuestions, questions.size) // Anzahl der zu spielenden Fragen begrenzen

        for (index in 0 until numQuestionsToPlay) {

            val question = questions[index]
            val currentPlayerName = players[currentPlayer].toString() // Spielername abrufen

            printlnColored("Aktueller Spieler: $currentPlayerName", ConsoleColor.BLUE) // Aktuellen Spieler anzeigen

            println("Frage ${index + 1}: ${question.text}")
            for (option in question.options) {
                println("\t$option")
            }

            print("Ihre Antwort: ")
            val answer = readln().uppercase()[0]
            answers.add(Answer(question, answer))

            if (answer == question.correctOption) {
                players[currentPlayer].points++
                printlnColored("Richtig!\n", ConsoleColor.GREEN)
                Thread.sleep(1100)
            } else {
                printlnColored("Falsch!\n", ConsoleColor.RED)
                printlnColored("Die richtige Antwort wäre: ${question.correctOption}\n", ConsoleColor.YELLOW)
                Thread.sleep(1100)
            }
            currentPlayer = (currentPlayer + 1) % players.size // Zum nächsten Spieler wechseln
        }

        println("Ergebnisse:")
        var punkteSumme = 0 // variable für die Gesamtpunktzahl aller Spieler

        for (player in players) {
            println("$player: ${player.points} Fragen richtig beantwortet.")
            punkteSumme += player.points
            println()
        }


        //Der Kampf beginnt
        Spieler(name).fusionFight() // Initialisierung des Spielerkampfes

        val spieler = Spieler("Quizmaster") // Name des fuisonierten kriegers
        val monster = Monster()

        // Der kritische Schaden basiert auf der Punktezahl der Spieler
        val kritischerSchaden = if (punkteSumme > 5) 1.5 else 1.0

//            val kritischerSchaden = while (difficultly){
//                1 -> 1.5 // Einfache Fragen: Kritischer Schaden um 50% erhöht
//                2 -> 2.0 // Mittelschwere Fragen: Kritischer Schaden um 100% erhöht
//                3 -> 3.0 // Schwere Fragen: Kritischer Schaden um 200% erhöht (doppelter Schaden)
//                else -> 1.0 // Standardwert für andere Eingaben
//            }

            while (spieler.lebenspunkte > 0 && monster.lebenspunkte > 0) {
                println("$spieler greift an!")
                val schaden = (spieler.waffe * kritischerSchaden - monster.verteidigung).coerceAtLeast(0.0).toInt()
                monster.lebenspunkte -= schaden
                println("Schaden: $schaden")
                println("Verbleibende Lebenspunkte des Monsters: ${monster.lebenspunkte}\n")
                Thread.sleep(1000)
                if (monster.lebenspunkte <= 0) {
                    println("Das Monster wurde besiegt!")
                    break
                }

                println("Das Monster greift an!")
                val schadenVomMonster = (monster.waffe - spieler.verteidigung).coerceAtLeast(0)
                spieler.lebenspunkte -= schadenVomMonster
                println("Schaden: $schadenVomMonster")
                println("Verbleibende Lebenspunkte des Spielers: ${spieler.lebenspunkte}\n")
                Thread.sleep(1000)
            }

            println("Ende des Kampfes")
            if (monster.lebenspunkte <= 0) {
                println("$spieler hat gewonnen!")
            } else {
                println("$spieler hat verloren!")
            }
        }
    }