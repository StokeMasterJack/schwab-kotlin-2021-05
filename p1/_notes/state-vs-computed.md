# state vs computed

Card's state are defined a val or var

Card's computed fields:
    function
    val isBlackjack:boolean = points == 21
    val isBlackjack:boolean get() = points == 21




Hand
    name:String             //Dealer or Player - set in Hand constructor
    isStay:Boolean          //player hit the stay (true) button or the deal button (false)
    cards: List<Card>       //cards in the hand
    
    //derived from the other fields
    
    
    cardCount:Int
    points: Int             //sum of card points
    status: String          //12 Points
    isBlackjack: Boolean    //points = 21
    isBust:Boolean          //points > 21


the state should be val or var (without the get())
derived field (derived from the state): function or a getter (val with get() )