package by.overpass.test.kotlin.js.action

import com.rnett.action.core.inputs
import com.rnett.action.core.outputs
import com.rnett.action.core.runAction
import kotlin.js.Date

suspend fun main() = runAction {
    val nameToGreet = inputs["who-to-greet"]
    console.log("Hello $nameToGreet!")
    outputs["time"] = Date().toTimeString()
}
