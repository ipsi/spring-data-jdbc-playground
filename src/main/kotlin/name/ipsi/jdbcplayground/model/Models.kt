package name.ipsi.jdbcplayground.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.repository.CrudRepository

interface ApplicationRepository : CrudRepository<Application, Int>

data class Application(
        @Id
        val applicationId: Int,
        val applicationState: String,
//        @Column(value = "APPLICATION_ID", keyColumn = "APPLICANT_ORDER")
//        @Column(value = "APPLICATION_ID")
        var applicants: Set<Applicant>
)

data class Applicant(
//        @Id
        val applicantId: Int,
        val applicationId: Int,
        val applicantOrder: Int,
        val firstName: String,
        val middleName: String? = null,
        val lastName: String
//        @Column(value = "APPLICANT_ID", keyColumn = "ADDRESS_TYPE")
//        var addresses: Map<AddressType, Address>,
//        @Column("APPLICANT_ID")
//        var contactDetails: ContactDetails
)

//enum class AddressType {
//    RESIDENTIAL,
//    PREVIOUS_RESIDENTIAL,
//    POSTAL
//}
//
//data class Address(
//        @Id
//        val addressId: Int,
//        val applicantId: Int,
//        val addressType: AddressType,
//        val streetNumber: String,
//        val streetName: String,
//        val streetType: String
//)
//
//data class ContactDetails(
//        val applicantId: Int,
//        val emailAddress: String,
//        @Column(value = "APPLICANT_ID", keyColumn = "PHONE_TYPE")
//        var phoneNumbers: Map<PhoneType, PhoneNumber>
//)
//
//enum class PhoneType {
//    HOME,
//    WORK,
//    MOBILE,
//    FAX
//}
//
//data class PhoneNumber(
//        val applicantId: Int,
//        val phoneType: PhoneType,
//        val countryCode: String,
//        val areaCode: String,
//        val number: String,
//        val extension: String
//)