package ie.irishlife.empower.poc.service.repository

import ie.irishlife.empower.poc.service.model.UserVO
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface  UserRepository : ReactiveMongoRepository<UserVO, String>