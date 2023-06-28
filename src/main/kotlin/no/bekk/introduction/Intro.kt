package no.bekk.introduction

data class BootcampCoach(
    val name: String,
    val avdeling: Avdeling,
    val yearsInBekk: Int,
)
enum class Avdeling {
    TEKNOLOGI, DESIGN, BMC
}

val ingrid = BootcampCoach(
    "Ingrid",
    Avdeling.TEKNOLOGI,
    3,
)

val coacher2023 = listOf<BootcampCoach>(ingrid)

fun main() {
    // Print konsulent
    // Flere statements kommentert ut
}
