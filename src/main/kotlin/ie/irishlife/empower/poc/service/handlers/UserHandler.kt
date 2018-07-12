package ie.irishlife.empower.poc.service.handlers

import ie.irishlife.empower.poc.service.model.UserVO
import ie.irishlife.empower.poc.service.repository.UserRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import org.springframework.http.HttpStatus.*
import org.springframework.web.reactive.function.BodyInserters.fromObject

@Component
class UserHandler(val userRepository: UserRepository) {
	

	fun getAll(serverRequest: ServerRequest) = ServerResponse
			.ok()
			.contentType(MediaType.APPLICATION_JSON)
			.body(userRepository.findAll(), UserVO::class.java);
	
	
	 fun add(req: ServerRequest): Mono<ServerResponse> {
        return req.bodyToMono(UserVO::class.java).flatMap { m -> 
            		ServerResponse.status(CREATED)
					.contentType(MediaType.APPLICATION_JSON)
					.body(fromObject(m))
        }
    }

}