package contracts

import org.springframework.cloud.contract.spec.*
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType


Contract.make{
    description "return all Users"
    request{
        url "/api/users"
        /*urlPath('/api/users'){
            queryParameters{
                parameter('id',123)
            }
        }*/
        method GET()
    }
    response{
        status 200
        headers{
//            header('Content-Type', 'application/json;charset=UTF-8')
            header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        }
        body(
                '''
                            {"data":[{"id":"1","name":"zhang"},{"id":"2","name":"zhang2"}]}
                            '''
        )
    }
}
