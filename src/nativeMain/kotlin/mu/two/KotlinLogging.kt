package mu.two

import mu.two.internal.KLoggerLinux

public actual object KotlinLogging {
  /**
   * This method allow defining the logger in a file in the following way:
   * ```
   * val logger = KotlinLogging.logger {}
   * ```
   */
  public actual fun logger(func: () -> Unit): mu.two.KLogger =
      KLoggerLinux(func::class.qualifiedName ?: "")

  public actual fun logger(name: String): mu.two.KLogger = KLoggerLinux(name)
}