package name.ipsi.jdbcplayground.api

import name.ipsi.jdbcplayground.model.Application
import name.ipsi.jdbcplayground.model.ApplicationRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Api(
        val applicationRepository: ApplicationRepository
) {


    @GetMapping("/api/data")
    fun loadApplications(): Collection<Application> {
        return applicationRepository.findAll().toList()
    }
}