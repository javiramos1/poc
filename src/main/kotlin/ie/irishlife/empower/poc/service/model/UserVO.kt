package ie.irishlife.empower.poc.service.model

import java.io.Serializable
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class UserVO(@Id val id : String, val firstName: String, val lastName: String)