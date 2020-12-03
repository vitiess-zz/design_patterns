package com.appersonic.dp.commandline

data class Command(val name: String, val parameters: List<String> = listOf()) {
    init {
        require(name.isNotBlank()) { "command name must not be blank" }
    }
}
