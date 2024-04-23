package br.senai.sp.jandira.mytrips

import java.time.LocalDate

fun simplificarData(dataExtenso: LocalDate): String{
    val dia = "${dataExtenso.dayOfMonth}"
    val mes = "${dataExtenso.month}".substring(0,3)
    val diaMes = "$dia - $mes"
    return  diaMes
}

