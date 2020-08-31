import java.util.*

public var input = Scanner(System. `in`);

fun main() {
    println("===== Data =====");
    print("Nama = ");
    var n: String? = input.nextLine();

    //input validation
    if (n.isNullOrEmpty()) {
        println("Nama harap diisi!")
        main()
    }

    print("Kelas = ");
    var k: String = input.nextLine();
    print("Nomor absen = ");
    var na: String = input.nextLine();
    print("Masukkan username instagram = ")

    //elvis operator
    val Username: String? = null
    val UsernameLength = Username?.length?: "OMG, saya tidak mengisi program input Username instagram"
    println(UsernameLength)
    println("=====================")
    menu()
}

//menu pilih opsi
fun menu() {
    println("===== Menu =====");
    println("1. Balok\n2. Bola\n3. Keluar")
    print("Pilih menu = ")
    val pill: Int? = input.nextInt()
    when (pill) {
        1 -> Balok()
        2 -> Bola()
        3 -> Keluar()
        else -> {
            println("Error")
            menu()
        }
    }
}

fun Balok() {
    println("===== Balok =====");
    print("Input panjang = ");
    val panjang: Double = input.nextDouble();
    print("Input lebar = ");
    val lebar: Double = input.nextDouble();
    print("Input tinggi = ");
    val tinggi: Double = input.nextDouble();

    val volume: Double = panjang*tinggi*lebar;
    println("Volume balok adalah $volume .")
    System.out.printf("%.2f",volume)
    println()

    menu()
    println("====================");

}

fun Bola() {
    val reader = Scanner(System.`in`)
    val jari: Float
    val volumepi: Float
    println("===== Bola =====");
    print("Input Jari-jari = ");
    jari = reader.nextFloat();
    volumepi = ((jari*jari*jari*22*4/7)/3);
    println("Volume bola adalah $volumepi .")
    System.out.printf("%.2f",volumepi)
    println()

    menu()
    println("====================")
}

fun Keluar() {
    System.exit(0)
}