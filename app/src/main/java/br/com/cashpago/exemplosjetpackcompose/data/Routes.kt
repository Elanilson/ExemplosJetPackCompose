package br.com.cashpago.exemplosjetpackcompose.data

sealed class Routes(val Route : String){
    object tela1 : Routes("tela1")
    object tela2 : Routes("tela2")
    object tela3 : Routes("tela3")
    object tela4 : Routes("tela4/{nome}"){
        fun createRoute(nome : String) = "tela4/$nome"
    }
    object tela5 : Routes("tela5/?nome={nome}"){
        fun createRoute(nome: String) = "tela5/?nome=$nome"
    }
}
