package exercicio2

    class Livros{
        var titulo = pegarTitulo()
        var qntdPaginas = pegarQntdPaginas()
        var paginasLidas = pegarPaginasLidas()

        fun informacoesLivro(){
            println("O livro $titulo possui $qntdPaginas páginas")
        }

        fun verificarProgresso(){
            val porcentagem = paginasLidas * 100 / qntdPaginas
            println("Você já leu $porcentagem por cento do livro")
        }

        fun pegarTitulo(): String{
            print("Insira o nome do livro: ")
            return readln()
        }

        fun pegarQntdPaginas(): Int {
            print("Quantas páginas esse livro possui? ")
            return readln().toInt()
        }

        fun pegarPaginasLidas(): Int {
            print("Quantas páginas você já leu? ")
            return readln().toInt()
        }
    }
