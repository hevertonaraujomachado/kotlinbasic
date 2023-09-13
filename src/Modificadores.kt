class Modificadores {

    /*
private -> Visível apenas dentro da classe
protected -> Funciona como o "private", mas é visível em subclasses
public -> Visível em todo lugar, caso não seja definido é o padrão.
internal -> Lembra o Public, mas sua visibilidade é
restringida ao módulo, sendo então visível dentro de um
mesmo módulo.
*/
    open class Animal {

        //private , protected, public
        internal var nome = "marley"

        fun dormir() {
            println("Dormir")
        }

    }

    class Cao : Animal() {
        fun exibeNome() {
            println("Método exibe nome: $nome")
        }
    }

    fun main(args: Array<String>) {

        val cao = Cao()
        cao.exibeNome()
        //println( animal.nome )

    }

}