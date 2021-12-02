fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

fun part1(input: List<String>): Int =
    input.toIntArray().increaseCount()

fun part2(input: List<String>): Int =
    input.toIntArray().windowed(3, 1, false, List<Int>::sum).increaseCount()


private fun List<String>.toIntArray() = map { it.trim().toInt() }
private fun List<Int>.increaseCount() =
    fold(0 to Int.MAX_VALUE) { (result, lastValue): Pair<Int, Int>, element: Int ->
        (if (element > lastValue) result + 1 else result) to element
    }.first