fun main() {
    val isMusicLover = true
    val totalAmount = 10_000_000
    val currentAmount = 196_330

    val discountFirst = 10_000
    val discountSecond = 5
    val discountForMusicLover = 1
    val discountAmount =
        if (totalAmount <= 1000 * 100) 0 else if (totalAmount <= (10_000 * 100)) discountFirst else currentAmount * discountSecond / 100

    println("Покупка на сумму - ${currentAmount / 100} руб ${currentAmount % 100} коп")

    if (totalAmount <= 1000 * 100) {
        println("У вас нет скидки")
    } else if (totalAmount <= (10_000 * 100)) {
        println("После применения скидки в 100 рублей - ${(currentAmount - discountAmount) / 100} руб ${(currentAmount - discountAmount) % 100} коп")
    } else {
        println("После применения 5% скидки - ${(currentAmount - discountAmount) / 100} руб ${(currentAmount - discountAmount) % 100} коп")
    }

    val discountAmountForMusicLover =
        if (isMusicLover) (currentAmount - discountAmount) * discountForMusicLover / 100 else (currentAmount - discountAmount)
    val currentAmountWithDiscountMusicLoverRub = (currentAmount - discountAmount - discountAmountForMusicLover) / 100
    val currentAmountWithDiscountMusicLoverPenny = (currentAmount - discountAmount - discountAmountForMusicLover) % 100

    if (isMusicLover) {
        println("После применения 1% скидки - $currentAmountWithDiscountMusicLoverRub руб $currentAmountWithDiscountMusicLoverPenny коп")
    } else println("Вы не меломан")
}