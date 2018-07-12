package ie.irishlife.empower.poc.service.routes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ie.irishlife.empower.poc.service.handlers.UserHandler

@Configuration
class UserRoutes {
	
	@Bean
    fun apiRouter(userHandle : UserHandler) =
            router {
                (accept(MediaType.APPLICATION_JSON) and "/api").nest {
                    "/owners".nest {
                        GET("/", ownersApiHandler::getOwners)
                        GET("/{id}", ownersApiHandler::getOwner)
                    }
                    "/pets".nest {
                        GET("/", petsApiHandler::getPets)
                        GET("/{id}", petsApiHandler::getPet)
                        GET("/{id}/visits", petsApiHandler::getPetVisits)
                    }
                }
            }