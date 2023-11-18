package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val angka1 = 5
    val angka2 = 0

    try {
        val hasil = angka1 / angka2
        println("hasil pembagian = $hasil")
    } catch (e: ArithmeticException){
        println("Angka2 tidak boleh nol")
    }

}