package ie.irishlife.empower.poc.service.repository

import ie.irishlife.empower.poc.service.model.UserVO
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "users")
interface  UserRepository : ReactiveMongoRepository<UserVO, String>