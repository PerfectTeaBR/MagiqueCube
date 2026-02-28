package test.perfect.tea.magiquecube

import net.perfect.tea.magiquecube.MagiqueCube
import net.perfect.tea.magiquecube.launcher.MagiqueCubeLauncher
import org.junit.platform.commons.logging.LoggerFactory


class HowdyWorld {
    companion object {
        val logger = LoggerFactory.getLogger(MagiqueCubeLauncher::class.java)
    }

    fun HowdyWorld() {
        logger.info { "Howdy World!" }
    }
}
