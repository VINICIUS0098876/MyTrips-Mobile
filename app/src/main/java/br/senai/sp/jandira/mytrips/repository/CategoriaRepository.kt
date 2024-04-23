package br.senai.sp.jandira.mytrips.repository

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.mytrips.model.Categorias
import br.senai.sp.jandira.mytrips.model.Viagem

class CategoriaRepository {
    @Composable
    fun listarCategorias(context: Context): List<Categorias> {
        val montanha = Categorias()
        montanha.id = 1
        montanha.icone = Icons.Default.Landscape
        montanha.nome = "Montain"

        val skiando = Categorias()
        skiando.id = 2
        skiando.icone = Icons.Default.DownhillSkiing
        skiando.nome = "Snow"

        val guardaSol = Categorias()
        guardaSol.id = 3
        guardaSol.icone = Icons.Default.BeachAccess
        guardaSol.nome = "Beach"




        val categorias = listOf(montanha, skiando, guardaSol)

        return  categorias
    }
}