package contracts

import org.springframework.cloud.contract.spec.*
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

/**
 * 非restfull方式
 */
Contract.make{
    description "return one user"
    request{
        urlPath('/api/userById'){
            queryParameters{
                parameter('id',123)
            }
        }
        method GET()
    }
    response{
        status 200
        headers{
//            header('Content-Type', 'text/plain;charset=utf-8')
            header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        }
        body(
                '''
                {
                  "id":"123","name":"zhang"
                }
                '''
        )
    }
}
