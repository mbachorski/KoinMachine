package pl.mbachorski.koinmachine.domain.di

import org.koin.dsl.module.module
import pl.mbachorski.koinmachine.domain.CoinMatrix
import pl.mbachorski.koinmachine.domain.CoinMint
import pl.mbachorski.koinmachine.domain.LowValueCoinMint

val coinMintModule = module {
    scope("lowValue") { CoinMatrix(1) }
    scope("highValue") { CoinMatrix(5) }
    single<CoinMint> { LowValueCoinMint(get(scopeId = "lowValue")) }
}