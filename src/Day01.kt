fun main() {
    fun part1(input: List<String>): Int = input.map { it.trim().toInt() }
        .fold(0 to Int.MAX_VALUE) { (result, lastValue): Pair<Int, Int>, element: Int ->
            (if (element > lastValue) result + 1 else result) to element
        }.first


    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
