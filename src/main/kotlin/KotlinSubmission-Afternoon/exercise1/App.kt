package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namadepan = "Fiki"
    val namabelakang = "Nur Rahman"
    val Umur = 22
    val tahun = "tahun"
    val univ = "Universitas Merdeka Madiun"
    println("Perkenalkan nama saya $namadepan $namabelakang, Umur saya $Umur $tahun, Saya berkuliah di $univ ")

    var Status_Single : Boolean = true
    var Status_Tidak : Boolean = false

    if (true) {
        println("Status saya single")
    } else {
        println("Status saya telah menikah")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return "$groupId,$groupMember,$session"

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val GrowZen = listOf("Adzannuloh","Angga","Irma","Fiki","Fikri","Hilda","Risma","Fikra","Adib","Beta")

    return listOf(GrowZen[3])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Pupu","Kak Aulia")
    val countOfGroup = arrayOf<String>("Adzannuloh","Angga","Irma","Fiki","Fikri","Hilda","Risma","Fikra","Adib","Beta")

    val jumlahsemua=mentor.count()+countOfGroup.count()

    return jumlahsemua
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Growzen", listOf("Adzannuloh","Angga","Irma","Fiki","Fikri","Hilda","Risma","Fikra","Adib","Beta"), "Afternoon")

}