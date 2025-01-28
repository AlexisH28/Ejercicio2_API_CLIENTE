package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class API_C {
    @GetMapping("/api/producto")
    @ResponseBody
    public String producto(Model model) {
        model.addAttribute("nombre", "Sancocho");
        model.addAttribute("precio", 10.80);
        model.addAttribute("descripcion", "Sancocho de Costilla, bueno para el cuerpo");
        return model.toString();
    }
}
