package bjoo

class Hand(val name: String) {

    var isStay:Boolean  = false

    val cardCount:Int  get() = 0

    val cardCount2:Int  = 0

    val points:Int get() = 21

    val isBust:Boolean get() = points > 21



    val isBlackjack:Boolean get() = points == 21



//    fun isBlackjack():Boolean{  //true
//        return points == 21
//    }

    val isBlackjack2:Boolean = points == 21
    var isBlackjack3:Boolean = points == 21

    val status:String get() = "$points Points"


}