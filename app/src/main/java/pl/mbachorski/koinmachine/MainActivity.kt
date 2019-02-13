package pl.mbachorski.koinmachine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import pl.mbachorski.koinmachine.domain.CoinMatrix
import pl.mbachorski.koinmachine.domain.CoinMint

class MainActivity : AppCompatActivity() {

    private val mint: CoinMint by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getKoin().createScope("lowValue")
        val coin = mint.makeCoin()
        text.text = "value: ${coin.value}"
        getKoin().getScope("lowValue").close()

        val highValueScope = getKoin().createScope("highValue")
        val matrix: CoinMatrix by inject(scope = highValueScope)
        text.append(matrix.value.toString())
        getKoin().getScope("highValue").close()
    }
}
