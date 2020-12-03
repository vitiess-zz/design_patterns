package com.appersonic.dp.commandline

import kotlin.system.exitProcess

class ExitCommandHandler(_nextHandler: CommandHandler? = null): CommandHandlerChain(nextHandler = _nextHandler) {
    override fun handle(command: Command): Int {
        if (command.name.toLowerCase() == "exit") {
            println("Goodbye.")
            exitProcess(status = 0);
        }
        return super.handle(command)
    }
}
