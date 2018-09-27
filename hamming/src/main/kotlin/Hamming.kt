object Hamming {
    fun compute(firstDNA: String, secondDNA: String): Int {
        require (firstDNA.length == secondDNA.length) {
            "left and right strands must be of equal length."
        }
        return firstDNA.zip(secondDNA).count { it.first != it.second }
    }
}