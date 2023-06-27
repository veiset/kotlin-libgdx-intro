// numbers er her en liste av tall

fun addNumberToList(n: Int) {
    numbers.add(n)
}

fun addNumberToList(n: Int) {
    val mutableNumbers = numbers.toMutableList()
    mutableNumbers.add(n)
    numbers = mutableNumbers.toList()
}

fun addNumberToList(n: Int) {
    numbers = numbers + n
}
