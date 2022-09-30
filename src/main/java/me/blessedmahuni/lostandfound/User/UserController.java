package me.blessedmahuni.lostandfound.User;

import me.blessedmahuni.lostandfound.ResponseBody.ResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @GetMapping()
    public ResponseEntity<ResponseBody> getUsers() {
        ResponseBody res = new ResponseBody("WORKS", true);
        return ResponseEntity.ok(res);
    }


}
