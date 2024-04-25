package com.rubberduck.petStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pet")
public class PetController {

    @GetMapping("create/{name}/{species}")
    public String createPet(@PathVariable String name, String species) {
        return "<h1>My Pet</h1>" +
                "<h3>" + name + "</h3>" +
                "<h4>" + species + "</h4>";
    }

    @GetMapping("createform")
    public String createPetForm() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "    <form action=\"create\" method=\"get\">\n" +
                "        <div>\n" +
                "            <label>Name: </label>\n" +
                "            <label>\n" +
                "                <input type=\"text\" name=\"name\">\n" +
                "            </label>\n" +
                "           <label>Species: </label>\\n\" +\n" +
                "            <label>\n\" +\n" +
                "                <input type=\"text\" name=\"species\">\n" +
                "           </label>\n" +
                "<input type='submit'>" +
                "        </div>\n" +
                "    </form>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }
}
