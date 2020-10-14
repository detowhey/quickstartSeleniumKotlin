package br.eti.henriquealmeida.utilities

class RandomData {
    companion object {

        fun firstNameRandom(): String = listOf("José", "Maria", "João", "Astrogildo").random()

        fun lastNameRandom(): String = listOf("Costa", "Figueredo", "Lima", "Freitas").random()

        fun postalCodeRandom(): String = listOf("1234", "5678", "9841", "6781").random()

        fun registeredCustomerRandom(): String = listOf(
            "Hermoine Granger", "Harry Potter", "Ron Weasly",
            "Albus Dumbledore", "Neville Longbottom"
        ).random()
    }
}