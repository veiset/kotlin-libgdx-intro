package no.bekk.introduction

data class BootcampCoach(
    val name: String,
    val avdeling: Avdeling,
    val yearsInBekk: Int,
)

val ingrid = BootcampCoach(
    "Ingrid",
    Avdeling.TEKNOLOGI,
    3,
)

val coacher2023 = listOf<BootcampCoach>(ingrid)

enum class Avdeling {
    TEKNOLOGI, DESIGN, BMC
}

val newList = coacher2023.map {
    when (it.name) {
        "Morten" -> it.copy(avdeling = Avdeling.BMC)
        "Ragnhild" -> it.copy(avdeling = Avdeling.DESIGN)
        else -> it
    }
}

val teknologiCoacher = newList.filter {
    it.avdeling == Avdeling.TEKNOLOGI
}
