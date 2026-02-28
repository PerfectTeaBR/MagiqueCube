# MagiqueCube
💻 A "Magic" Logger just for fun :3

## 📦 How to Use

In your .kt file...

```kotlin
class HowdyWorld {
    companion object {
        val logger = LoggerFactory.getLogger(MagiqueCubeLauncher::class.java)
    }

    fun HowdyWorld() {
        logger.info { "Howdy World!" }
    }
}
```

Logging:

```kotlin
logger.info("Howdy World!")
```
