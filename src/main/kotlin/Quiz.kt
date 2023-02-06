class Quiz(private val questions: List<Question>) {
    fun start() {
        var points = 0
        val answers = mutableListOf<Answer>()
        for ((index, question) in questions.withIndex()) {
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
        }
        println("Sie haben $points von ${questions.size} Fragen richtig beantwortet.")
    }
}
