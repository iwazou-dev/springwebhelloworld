package org.iwazou.sample.springwebhelloworld;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getMessage() {

        /*
         *
         * 本来はデータベースアクセスなどのなんらかのビジネスロジック
         *
         */

        return "Hello, world!";
    }

}
