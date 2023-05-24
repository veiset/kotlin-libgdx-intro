package no.bekk.introduction

data class Konsulent(val name: String)

fun main() {
    val gaute = Konsulent("Gaute")
    // sjekk hvilke egenskaper og funksjoner som finnes på en `Konsulent`
    // merk at vi ikke trenger getter?
    println(gaute)
    // Endre til data class - hvilke egenskaper får du opp nå?
    // vi får copy, og



    // Prøv å endre navnet til konsulenten

    /**
    gaute.name = "Sondre"
    // */

    /**
    val sondre = gaute.copy(name = "Sondre")
    println(sondre)
    // */

    // I standardbiblioteket til kotlin skiller man på datastrukturer som kan endres direkte (muterbare), og de hvor man ikke kan det
    // feks finnes det både `List<T>` og `MutableList<T>` som begge er generiske lister, men `List` implementerer ikke funksjoner som `add` og `remove`.
    listOf(1,2,3)
    mutableListOf(1)

}