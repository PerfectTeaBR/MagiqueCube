import org.slf4j.Logger
import org.slf4j.event.Level

class MagiqueCube(private val slf4jLogger: Logger){

     fun log() {
        val level: Level = Level.INFO
        val block: () -> String
    }

    private fun LoggingLevelToSLF4J() {
        val ERROR = Level.ERROR
        val WARN = Level.WARN
        val INFO = Level.INFO
        val DEBUG = Level.DEBUG
        val TRACE = Level.TRACE
    }
}