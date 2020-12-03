package com.appersonic.dp.commandline

interface CommandHandler {
    fun handle(command: Command): Int
}
