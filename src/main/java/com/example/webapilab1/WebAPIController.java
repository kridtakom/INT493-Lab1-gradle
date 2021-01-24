package com.example.webapilab1;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/messages")
public class WebAPIController {
    
ArrayList<TextModel> webList = new ArrayList<TextModel>();
    DataModel data = new DataModel();

    @GetMapping("")
    public DataModel getMessage() {
        return data;
    }

    @PostMapping("")
    public void postMessage(@RequestBody TextModel text) {
        boolean find = false;
        for (TextModel textModel : webList) {
            if (textModel.getText().equals(text.getText())) {
                find = true;
                textModel.setCount(textModel.getCount() + 1);
            }
        }
        data.setData(webList);
        if (!find) {
            TextModel newText = new TextModel(text.getText().trim(), 1);
            webList.add(newText);
            data.setData(webList);
        }
    }
    
}