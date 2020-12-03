package com.appersonic.dp.commandline

class VersionCommandHandler(_nextHandler: CommandHandler? = null): CommandHandlerChain(nextHandler = _nextHandler) {
    override fun handle(command: Command): Int {
        return if (command.name.toLowerCase() == "version") {
            println("Version 1.0")
            0
        } else {
            super.handle(command)
        }
    }
}
