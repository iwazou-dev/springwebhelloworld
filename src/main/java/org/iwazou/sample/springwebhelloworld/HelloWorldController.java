package org.iwazou.sample.springwebhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    private final HelloWorldService service;

    public HelloWorldController(HelloWorldService service) {
        this.service = service;
    }

    @GetMapping("/helloworld")
    public String doGetHelloWorld(Model model) {
        /*
         * ビジネスロジックの呼び出し
         */
        String message = service.getMessage();

        /*
         * ビューへ渡すデータの設定
         */
        model.addAttribute("message", message);

        /*
         * ビューの指定
         */
        return "HelloWorldView";
    }

}
