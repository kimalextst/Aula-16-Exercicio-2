package exercicio2

fun main(){
    verificacaoPorcentagem()
}

fun verificacaoPorcentagem(){
    for (contador in 1..qntdLivros()){
        val livrosVerificacao : Livros = Livros()
        livrosVerificacao.informacoesLivro()
        livrosVerificacao.verificarProgresso()
    }
}

fun qntdLivros(): Int {
    print("Quantos livros deseja cadastrar? ")
    return readln().toInt()
}


