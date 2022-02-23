fun main() {
    //Faça um programa que receba três inteiros e diga qual deles é o maior
    println("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val n2 = readLine()!!.toInt()
    println("Digite o terceiro número:" )
    val n3= readLine()!!.toInt()

    if (n1 > n3 && n1 > n2)
        println("Maior número é $n1")
    else if (n2 > n1 && n2 > n3)
        println("Maior número é $n2")
    else println ("Maior número é $n3")
}