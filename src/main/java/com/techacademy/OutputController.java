package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("inputstr") String inputstr, Model model) {
        //フォームから送信されて来た値をModelに登録
        model.addAttribute("inputstr",inputstr);
        //output.htmlに画面遷移
        return "output";
    }


}
