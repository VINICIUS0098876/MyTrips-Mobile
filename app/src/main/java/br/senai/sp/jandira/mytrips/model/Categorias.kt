package br.senai.sp.jandira.mytrips.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Categorias(
    var id: Int = 0,
    var nome: String = "",
    var icone: ImageVector?= null
)
