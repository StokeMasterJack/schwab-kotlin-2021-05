package cs.blackjack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import cs.blackjack.ui.theme.BlackjackTheme

/*
Fragment
 */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BlackjackTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    GameController()
                }
            }
        }
    }
}

@Composable
fun GameController() {

//    val g = Game().deal()

    val (g, setG) = remember { mutableStateOf(Game().deal()) }

    val deal = { setG(g.deal()) }
    val hit = { setG(g.hit()) }
    val stay = { setG(g.stay()) }

    GameVu(g = g, deal = deal, hit = hit, stay = stay)


}

typealias VF = () -> Unit

@Composable
fun GameVu(g: Game, deal: VF, hit: VF, stay: VF) {
    Column {
        BjButtonBar(g.isGameActive, deal = deal, hit = hit, stay = stay)
        Row {
            HandVu(g.ph)
            HandVu(g.dh)
        }
        Text(text = "Press Hit or Stay")
    }

}

@Composable
fun HandVu(h: Hand) {
    Column {
        Text(text = h.name)
        Column {
            h.cards.forEach {
                Text(text = it.name)
            }
        }
        Text(text = h.status)
    }

}

@Composable
fun BjButtonBar(isGameActive: Boolean, deal: VF, hit: VF, stay: VF) {
    Row() {
        Button(enabled = !isGameActive, onClick = deal) {
            Text(text = "Deal")
        }
        Button(enabled = isGameActive, onClick = hit) {
            Text(text = "Hit")
        }

        Button(enabled = isGameActive, onClick = stay) {
            Text(text = "Stay")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BlackjackTheme {
        GameController()
    }
}