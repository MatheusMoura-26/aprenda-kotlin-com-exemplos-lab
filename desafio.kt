// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(
	val nome: String,
    val email:String,
    val idade: Int
	)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var descricao: String)

data class Formacao(val nome: String,  val nivel:String, var conteudos:MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome!")
    }
    
    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
        println("Conteúdo '${conteudo.nome}' adicionado à formação $nome!")
    }

    fun removerConteudo(conteudo: ConteudoEducacional) {
        conteudos.remove(conteudo)
        println("Conteúdo '${conteudo.nome}' removido da formação $nome!")
    }

}

fun main() {
     val usuario1 = Usuario("Jose", "jose@test.com", 21)
     val usuario2 = Usuario("Marina", "marina@test.com", 32)
   	 
    val conteudo1 = ConteudoEducacional("Introdução a python ", 35, "Primeiros passos com python")
    val conteudo2 = ConteudoEducacional("POO com Java", 120, "Entendendo POO com a linguagem java")
    
    val formacaoPython = Formacao("Formação Pytho developer", "Intermediario")
   	formacaoPython.adicionarConteudo(conteudo1)
    
    formacaoPython.matricular(usuario1)
    formacaoPython.matricular(usuario2)
}