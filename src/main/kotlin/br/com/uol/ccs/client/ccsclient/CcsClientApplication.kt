package br.com.uol.ccs.client.ccsclient

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CcsClientApplication : CommandLineRunner {
    override fun run(vararg args: String?) {
        
    }
}

fun main(args: Array<String>) {
    runApplication<CcsClientApplication>(*args)
}
