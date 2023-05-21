class Spieler(name: String) : Krieger() {

    // Lässt den Text live in der Konsole schreiben (effect)
    fun printWithDelay(text: String, delayMillis: Long) {
        for (char in text) {
            print(char)
            Thread.sleep(delayMillis)
        }
        println()
    }

    // Text für das Intro
    fun fusionOpening() {
        printWithDelay("""Es war einmal ein friedliches Land, in dem die Menschen gerne Quizspiele spielten. 
Eines Tages jedoch tauchte ein mächtiges QuizMonster namens Rätselmeister auf. 
Es hatte die Fähigkeit, die Menschen mit seinen kniffligen Fragen und Rätseln herauszufordern.""".trimMargin(), 30)
        println()
        printWithDelay("""Die Menschen waren verzweifelt und suchten nach einer Lösung. 
Da kam eine Gruppe von Spielern zusammen, die beschlossen, ihre Kräfte zu vereinen, um gegen das QuizMonster anzutreten. 
Sie alle waren erfahrene Quizspieler und hatten bereits viele Herausforderungen gemeistert.""".trimMargin(),30)
        println()
        printWithDelay("""Die Spieler nannten sich "Die Vereinten" und begannen mit intensivem Training. 
Sie arbeiteten zusammen, um ihre Quizkenntnisse zu verbessern und ihre Fähigkeiten zu schärfen. 
Doch sie merkten bald, dass sie allein nicht stark genug waren, um gegen den furchteinflößenden Rätselmeister anzukommen.""".trimMargin(),30)
    }

    fun fusionFight() {
        printWithDelay("""Die Vereinten begannen mit dem Ritual der Fusion. 
Sie konzentrierten sich und verschmolzen zu einem einzigen mächtigen Krieger. 
Der Krieger hatte das Wissen und die Fähigkeiten aller Spieler in sich vereint. 
Sein Name war Quizmaster.""".trimMargin(), 30)
        println()
        printWithDelay("""Quizmaster machte sich bereit für den finalen Kampf gegen das QuizMonster Rätselmeister. 
Sie trafen sich in einem furchterregenden Labyrinth voller Rätsel und Fragen.""".trimMargin(), 30)
        println()
        printWithDelay("""Die Menschen beobachteten den Kampf gespannt, in der Hoffnung,
dass Quizmaster den Rätselmeister besiegen würde und Frieden in ihr Land zurückkehren könnte.""".trimMargin(), 30)
        println()
        printWithDelay("""Doch das Ergebnis des Kampfes bleibt ungewiss. 
Wer würde als Sieger hervorgehen? 
Nur die Zeit wird es zeigen.""".trimMargin(), 30)
        println()
    }
}
