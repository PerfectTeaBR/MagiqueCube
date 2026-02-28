package net.perfect.tea.magiquecube.launcher

import net.perfect.tea.magiquecube.MagiqueCube
import org.slf4j.LoggerFactory
import org.slf4j.Logger

class MagiqueCubeLauncher(@PublishedApi internal val slf4j: Logger) {

    inline fun info(block: () -> String) {
        if (slf4j.isInfoEnabled) slf4j.info(block())
    }

    inline fun error(block: () -> String) {
        if (slf4j.isErrorEnabled) slf4j.error(block())
    }



}