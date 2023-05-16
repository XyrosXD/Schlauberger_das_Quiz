class Player(var name: String) {

    var score: Int = 0


    fun addScore(points: Int) {
        score += points
    }
    override fun toString(): String {
        return name
    }
}