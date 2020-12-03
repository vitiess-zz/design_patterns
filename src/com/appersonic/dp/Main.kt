package com.appersonic.dp

import com.appersonic.dp.commandline.Command
import com.appersonic.dp.commandline.CommandHandler
import com.appersonic.dp.commandline.ExitCommandHandler
import com.appersonic.dp.commandline.VersionCommandHandler

fun main(args: Array<String>) {
    val commandHandler = getCommandHandler()
    commandHandler.handle(Command("version"))
    commandHandler.handle(Command("exit"))
}

private fun getCommandHandler(): CommandHandler {
    return ExitCommandHandler(VersionCommandHandler())
}
