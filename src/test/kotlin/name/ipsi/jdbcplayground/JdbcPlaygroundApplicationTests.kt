package name.ipsi.jdbcplayground

import name.ipsi.jdbcplayground.model.Applicant
import name.ipsi.jdbcplayground.model.Application
import name.ipsi.jdbcplayground.model.ApplicationRepository
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class JdbcPlaygroundApplicationTests {

    @Autowired
	private lateinit var appRepository: ApplicationRepository

	@Test
	fun canLoadDataFromDb() {
        assertThat(appRepository.findAll().toList(), equalTo(listOf(Application(
                0,
                "NEW",
                setOf(Applicant(
                        0,
                        0,
                        1,
                        "FNAME",
                        null,
                        "LNAME"
                ))))))
	}

}
