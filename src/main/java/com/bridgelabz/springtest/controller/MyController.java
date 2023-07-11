package com.bridgelabz.springtest.controller;


import com.bridgelabz.springtest.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

                            /*  UC-1  */
    @RequestMapping(value = "/Message",method = RequestMethod.GET)
    public String message(){
        return "Hello from Bridgelabz";                         ////-->> localhost:8084/message
    }

                            /*  UC-2  */
    @RequestMapping(value = "/Queryparam",method = RequestMethod.GET)
    public String message1(@RequestParam String name){
        return "Hello" +name+ "from Bridgelabz ";                             ////-->> localhost:8084/Queryparam?name=<pass a String>
    }

                            /*  UC-3  */
    @RequestMapping(value = "/path/{name}",method = RequestMethod.GET)
    public String message2(@PathVariable String name){
        return "Hello" +name+ "from Bridgelabz ";                            ////-->> localhost:8084/path/<pass a String>
    }

                             /*  UC-4  */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String message3(@RequestBody User user){
        return "Hello " +user.fName +" "+user.lName+" from Bridgelabz";       ////-->>Open a REST client (e.g. Postman) and send a POST request
                                                                ////-->> localhost:8084/user
                                                                ////-->> { "fName" :"Mark",
                                                                ////-->>   "lName": "Taylor" }

    }

                            /*  UC-5  */
    @PutMapping("put/{fName}")
    public String message4(@PathVariable String fName,@RequestParam(value = "lName") String lName){
        return  "Hello " +fName+ " "+lName+" from Bridgelabz";                     ////-->>Open a REST client (e.g. Postman) and send a PUT request
                                                                ////-->> localhost:8084/put/Mark?lName=Taylor
    }
}
