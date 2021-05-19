package proyect.cema.Web.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyect.cema.Services.MailService;

@Controller
public class SendMailController {
    @Autowired 
    private MailService mailService;

 

    @PostMapping("/sendMail")
    public String sendMail(@RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("subject") String subject,@RequestParam("body") String body){
        String message = body + "\n\n Datos de ccontacto: "+ "\nNombre: "+ name + "\nEmail: "+ mail ;
        mailService.sendMail("cemaclothes@gmail.com", "cemaclothes@gmail.com", subject, message);
        return "about-us";
    }
}
