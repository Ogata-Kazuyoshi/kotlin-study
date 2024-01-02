package Coroutine
import  kotlinx.coroutines.*

suspend fun doTask(taskName:String, delayTime:Long):String {
    delay(delayTime)
    return "${taskName} 完了"
}