package pl.mbachorski.koinmachine.domain

interface CoinMint {
    fun makeCoin(): Coin
}

class LowValueCoinMint : CoinMint {
    override fun makeCoin() = Coin(1)
}

class HighValueCoinMint : CoinMint {
    override fun makeCoin() = Coin(5)
}