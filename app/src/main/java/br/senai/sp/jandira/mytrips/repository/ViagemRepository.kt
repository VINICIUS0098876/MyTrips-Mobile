package br.senai.sp.jandira.mytrips.repository
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Viagem
import java.time.LocalDate

class ViagemRepository {
    @Composable
    fun listarTodasAsViagens(context: Context): List<Viagem> {

        // Cria um objeto em Kotlin
        val viagemLondres = Viagem()
        viagemLondres.id = 1
        viagemLondres.destino = "Londres"
        viagemLondres.descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. "
        viagemLondres.dataChegada = LocalDate.of(2023, 7, 18)
        viagemLondres.dataPartida = LocalDate.of(2023, 7, 25)
        viagemLondres.imagem = painterResource(id = R.drawable.london)

        val viagemParis = Viagem()
        viagemParis.id = 2
        viagemParis.destino = "Paris"
        viagemParis.descricao = "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura."
        viagemParis.dataChegada = LocalDate.of(2023, 7, 26)
        viagemParis.dataPartida = LocalDate.of(2023, 8, 4)
        viagemParis.imagem = painterResource(id = R.drawable.paris)

        val viagemRoma = Viagem()
        viagemRoma.id = 3
        viagemRoma.destino = "Roma"
        viagemRoma.descricao = "Roma, a capital da Itália, é uma cidade cosmopolita, enorme, com quase 3.000 anos de arte, arquitetura e cultura influentes no mundo todo e à mostra."
        viagemRoma.dataChegada = LocalDate.of(2024, 1, 18)
        viagemRoma.dataPartida = LocalDate.of(2024, 4, 10)
        viagemRoma.imagem = painterResource(id = R.drawable.italia)

        val viagemMunique = Viagem()
        viagemMunique.id = 4
        viagemMunique.destino = "Munique"
        viagemMunique.descricao = "Munique, capital da Bavária, abriga prédios centenários e inúmeros museus."
        viagemMunique.dataChegada = LocalDate.of(2022, 6, 4)
        viagemMunique.dataPartida = LocalDate.of(2022, 6, 9)
        viagemMunique.imagem = painterResource(id = R.drawable.munique)

        val viagens = listOf(viagemLondres, viagemParis, viagemRoma, viagemMunique)

        return viagens

    }
}