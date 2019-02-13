package pl.mbachorski.koinmachine.domain

interface CoinMachine {
    fun insertCoin(coin: Coin)
    fun getBalance(): Int
    fun useCoins()
}