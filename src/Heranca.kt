class Heranca {

    open class Animal {

        open fun dormir() {
            println("Dormir")
        }

        fun correr() {
            println("Correr")
        }
    }

    class Cao : Animal() {

        override fun dormir() {
            super.dormir()
            println("como um cao")
        }

        fun latir() {
            println("Latir")
        }

    }

    class Passaro : Animal() {}

    fun main(args: Array<String>) {

        val cao = Cao()
        cao.dormir()
        cao.correr()
        cao.latir()

        val passaro = Passaro()
        //passaro.dormir()

    }

}