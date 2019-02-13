package pl.mbachorski.koinmachine.domain.di

import org.koin.dsl.module.module
import pl.mbachorski.koinmachine.domain.CoinMint
import pl.mbachorski.koinmachine.domain.LowValueCoinMint

val coinMintModule = module {
    single<CoinMint> { LowValueCoinMint() }
}