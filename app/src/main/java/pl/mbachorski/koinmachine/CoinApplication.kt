package pl.mbachorski.koinmachine

import android.app.Application
import org.koin.android.ext.android.startKoin
import pl.mbachorski.koinmachine.domain.di.coinMintModule

class CoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(coinMintModule))
    }
}