import java.awt.Color

@DslMarker // Required to change core kotlin behaviour
annotation class MonsterBuilderPart

@MonsterBuilderPart
class Monster() {

    private val bodyParts = mutableListOf<MonsterBodyPart>()

    fun head (init: MonsterHead.() -> Unit) : MonsterHead {
        val head = MonsterHead()
        bodyParts.add(head)
        return head
    }

    fun leg (init: MonsterLeg.() -> Unit) : MonsterLeg {
        val leg = MonsterLeg()
        bodyParts.add(leg)
        return leg
    }
}

@MonsterBuilderPart
interface MonsterBodyPart

class MonsterHead : MonsterBodyPart {

    private val eyes = mutableListOf<MonsterEye>()

    fun eye(color: Color) : MonsterEye{
        val eye = MonsterEye(color)
        eyes.add(eye)
        return eye
    }

}

class MonsterLeg : MonsterBodyPart {

    private val toes = mutableListOf<MonsterToe>()

    fun toe() : MonsterToe {
        val toe = MonsterToe()
        toes.add(toe)
        return toe
    }

}

class MonsterToe
class MonsterEye(val color: Color)


fun monster(init: Monster.() -> Unit) : Monster {
    return Monster()
}


val erikSuperMonster = monster {
    head {
        eye(Color.GREEN)
        eye(Color.BLUE)
    }
    leg {
        toe()
        toe()
        toe()
    }
    leg{
        toe()
        toe()
        toe()
    }
}


// TODO:
// Now remove the DslMarker and add head { head { ...