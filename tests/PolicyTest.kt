fun main() {
    val signalcase_1 = Signal(86, 104, 12, 14, 4)
    check(Policy.score(signalcase_1) == 216)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(62, 95, 15, 16, 7)
    check(Policy.score(signalcase_2) == 160)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(77, 70, 14, 21, 6)
    check(Policy.score(signalcase_3) == 142)
    check(Policy.classify(signalcase_3) == "review")
}
