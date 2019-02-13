package pl.mbachorski.koinmachine.domain

interface CoinMint {
    fun makeCoin(): Coin
}

class LowValueCoinMint(private val matrix: CoinMatrix) : CoinMint {
    override fun makeCoin() = Coin(matrix.value)
}

class HighValueCoinMint : CoinMint {
    override fun makeCoin() = Coin(5)
}

class CoinMatrix(val value: Int)