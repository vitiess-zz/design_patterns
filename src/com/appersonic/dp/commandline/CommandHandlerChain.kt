package com.appersonic.dp.commandline

import java.lang.IllegalStateException

abstract class CommandHandlerChain(private val nextHandler: CommandHandler?): CommandHandler {
    override fun handle(command: Command): Int {
        return nextHandler?.handle(command)
            ?: throw IllegalStateException("'${command.name}' command is not supported");
    }
}
