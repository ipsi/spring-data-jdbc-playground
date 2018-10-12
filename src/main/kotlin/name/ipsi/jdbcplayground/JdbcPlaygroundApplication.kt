package name.ipsi.jdbcplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder
import javax.sql.DataSource


@SpringBootApplication
@EnableJdbcRepositories
class JdbcPlaygroundApplication {
    @Bean
    fun dataSource(): DataSource {

        val builder = EmbeddedDatabaseBuilder()
        return builder.setType(EmbeddedDatabaseType.HSQL)/*.addDefaultScripts()*/.build()
    }
}

fun main(args: Array<String>) {
    runApplication<JdbcPlaygroundApplication>(*args)
}
