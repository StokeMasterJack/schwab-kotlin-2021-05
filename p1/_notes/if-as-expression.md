# If Expressions

In Java:
    If statement
    If-ish expression:aka ternary operator
        int drinkingAge = state == "WS" ? 14 : 21

Statement vs expression
    Statement generally _changes_ something (or does something)
        //return, goto

    Expressions compute a value but do not change anything (no side-effects)

## In Kotlin if is an expression
      int drinkingAge1 = if(state == "WS")  14 else 21

        int drinkingAge2 = if(state == "WS"){
            print(1)
            print(1)
            print(1)
            print(1)
            14
        }
        else {
            print(1)
            print(1)
            print(1)
            print(1)
            21
        }


## DoOnYourOwn: Modify Card.computeSuitName() to have only ONE return (by using an if "expression" )

        int sn = if(state == "WS"){
            "Spades"
        }
        else {
           "Heart
        }