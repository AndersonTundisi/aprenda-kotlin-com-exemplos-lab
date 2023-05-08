// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, var formacao: Formacao? = null)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        usuario.formacao = this
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario("Anderson")
    val usuario2 = Usuario("Waleuska")
    val usuario3 = Usuario("Venilton")

    val conteudo1 = ConteudoEducacional("Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Java", 180)
    val conteudo3 = ConteudoEducacional("SQL", 240)

    val formacao1 = Formacao("Boot Camp - DIO TQI Kotlin", listOf(conteudo1, conteudo2, conteudo3))
    val formacao2 = Formacao("Análise de Dados", listOf(conteudo2))
    val formacao3 = Formacao("Back End Developer", listOf(conteudo2, conteudo3))

    formacao1.matricular(usuario1)
    formacao2.matricular(usuario2)
    formacao3.matricular(usuario3)
    
    val nivel1 = Nivel.BASICO
    val nivel2 = Nivel.DIFICIL 
    val nivel3 = Nivel.INTERMEDIARIO
  
    println("${usuario1.nome}, Matriculado em: ${usuario1.formacao?.nome} - $nivel1")
    println("${usuario2.nome}, Matriculado em: ${usuario2.formacao?.nome} - $nivel2")
    println("${usuario3.nome}, Matriculado em: ${usuario3.formacao?.nome} - $nivel3")
}
