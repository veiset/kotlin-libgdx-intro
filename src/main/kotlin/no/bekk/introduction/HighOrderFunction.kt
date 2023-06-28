package no.bekk.introduction

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
